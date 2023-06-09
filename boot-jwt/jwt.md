# Spring Boot JWT Tutorial

## JWT

### 특징

- RFC 7519 웹 표준으로 지정
- Json 객체를 사용해서 토큰 자체에 정보들을 저장하고 있는 Web Token

### 구성

- Header
    - 시크니쳐를 해싱하기 위한 알고리즘 정보 포함
- Payload
    - 서버와 클라이언트가 주고받는, 시스템에서 실제로 사용됧 정보에 대한 내용 포함
- Signature
    - 토큰의 유효성 검사를 위한 문자열 포함
        - 이 문자열을 통해 서버에서는 이 토큰이 유효한 토큰인지 검증

### 장단점

- 장점
    - 헤비하지않고 아주 간편하고 쉽게 적용 가능
    - 중앙의 인증서버, 데이터 스토어에 대한 의존성 없음, 시스템 수평 확장 유리
    - Base64 URL safe encoding을 사용하기 때문에 URL, Cookie, Header 모두 사용 가능
- 단점
    - Payload의 정보가 많아지면 네트워크 사용량 증가, 데이터 설계 고려 필요
    - 토큰이 서버에 저장되지 않고 클라이언트에 저장 = 서버에서 각 클라이언트의 토큰을 조작할 수 없음

### project setting

```java

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }
}
```

- 일반적인 controller 만들어서 테스트한 결과, 'Unauthorized'가 나온걸 확인하였다

  ![img.png](img.png)

### 1. Security 섫정, Data 설정

- 401 unauthorized 해결을 위한 Security 설정
- Datasource, JPA 설정
- Entity 생성
- H2 Console 결과 확인

```java
@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                .requestMatchers("/api/hello", "/api/authenticate", "/api/signup").permitAll()
                .requestMatchers(PathRequest.toH2Console()).permitAll()
                .anyRequest().authenticated()
            )
            // enable h2-console
            .headers(headers ->
                headers.frameOptions(options ->
                    options.sameOrigin()
                )
            )
        return http.build();
    }
}
```

### 2. JWT 코드, Security 설정 추가

- JWT 설정 추가
- JWT 관련 코드 개발

```java
// 기본적인 Web 보안을 활성화
// 추가적인 설정을 위해서 WebSecurityConfigurer를 implements 하거나
// WebSecurityConfigurerAdapter를 extends 하는 방법도 있음
// authorizeRequests : HttpServletRequuest를 사용하는 요청들에 대한 접근제한을 설정
@EnableWebSecurity
@EnableMethodSecurity
@Configuration
public class SecurityConfig {
    
    // jwt 디렉토리 안에 만들어 둔 다섯개의 jwt 관련 클래스를 이 SecurityConfig 클래스 안에 적용한다
    
    private final TokenProvider tokenProvider;
    private final CorsFilter corsFilter;
    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    private final JwtAccessDeniedHandler jwtAccessDeniedHandler;

    public SecurityConfig(
        TokenProvider tokenProvider,
        CorsFilter corsFilter,
        JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint,
        JwtAccessDeniedHandler jwtAccessDeniedHandler
    ) {
        this.tokenProvider = tokenProvider;
        this.corsFilter = corsFilter;
        this.jwtAuthenticationEntryPoint = jwtAuthenticationEntryPoint;
        this.jwtAccessDeniedHandler = jwtAccessDeniedHandler;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // token을 사용하는 방식이기 때문에 csrf를 disable합니다.
            .csrf(csrf -> csrf.disable())

            .addFilterBefore(corsFilter, UsernamePasswordAuthenticationFilter.class)
            .exceptionHandling(exceptionHandling -> exceptionHandling
                .accessDeniedHandler(jwtAccessDeniedHandler) // 내가 만든 handler로 직접 추가
                .authenticationEntryPoint(jwtAuthenticationEntryPoint) // 내가 만든 handler로 직접 추가
            )

            .authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                .requestMatchers("/api/hello", "/api/authenticate", "/api/signup").permitAll()
                .requestMatchers(PathRequest.toH2Console()).permitAll()
                .anyRequest().authenticated()
            )

            // 세션을 사용하지 않기 때문에 STATELESS로 설정
            .sessionManagement(sessionManagement ->
                sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            )

            // enable h2-console
            .headers(headers ->
                headers.frameOptions(options ->
                    options.sameOrigin()
                )
            )

            .apply(new JwtSecurityConfig(tokenProvider));
        // jwtFilter를 addFilterBefore로 등록했던 JwtSecurityCofig 클래스도 적용해주기
        return http.build();
    }
}
```

### 3. DTO, Repository, 로그인

- 외부와의 통신에 사용할 DTO 클래스 생성
- Repository 관련 코드 생성
- 로그인 API, 관련 로직 생성

### 4. 회원가입, 권한검증

- 회원가입 API 생성
- 권한검증 확인

---
강의 : [Spring Boot JWT Tutorial](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-jwt/dashboard)