# GraphQL

> 23-06-08

## 🤖 (1) GraphQL 은 뭘까?

### ‘쿼리 언어’이다.

- 쿼리언어란 ? (Query Language)
  - 쿼리 언어는 정보를 얻기 위해 보내는 질의문(Query)를 만들기 위해 사용되는 컴퓨터 언어
  - API에서 데이터를 읽고 변경하기 위함
  - SQL이 데이터베이스 시스템으로부터 데이터를 가져오는 목적을 가진다면, GraphQL은 클라이언트가 데이터를 서버로부터 가져오는 것을 목적으로 함
- 데이터의 스키마를 설명할 수 있는 유형시스템을 제공하여 api의 프론트엔드에게 정확한 데이터를 탐색하고 요청할 수 있는 권한 제공

### ⇒ 데이터를 서버로부터 효율적으로 가져오기 위해 사용되는 방법을 제공

## 🤖 (2) GraphQL 은 왜 생겨났을까?

### graphql 생겨난 이유

페이스북 : ios, 안드로이드 등 다양한 기기에서 필요한 정보의 형태가 조금씩 달랐는데, 기존의 rest api로는 이 것들을 하나하나 구현하는게 넘 힘들었어요 😢

⇒ rest api의 문제점을 해결하려고!

### rest api 의 문제점

1. over fetching
  1. 내가 필요한 것보다 더 많은 데이터를 가져온다
  2. graphql은 정확하게 필요한 정보만 요청할 수 있음
  3. 예) user/book~~s~~
  4. 예2) https://swapi.dev/ ← 클릭해보세요
2. under fetching
  1. 필요한 것보다 적은 양의 데이터를 가져온다
  2. 추가적인 리소스 요청 발생
  3. 예)

      ```graphql
      {
      bestseller {
          book_title
          }
      mybook {
          book_title
          book_author
          }
      }
      ```

      ```json
      {
      "bestseller" : {
              { "book_title" : "멋진 책" },
              { "book_title" : "대박난 책" },
              { "book_title" : "신기한 책" },
          }
      "mybook" : [
              { "book_title" : "내가 산 책1", "book_author" : "김씨"},
              { "book_title" : "내가 산 책2", "book_author" : "이씨"},
              { "book_title" : "내가 산 책3", "book_author" : "박씨"},
          ]
      }
      ```



### ⇒ graphql은 over fetching, under fetching을 한번에 해결한다

## 🤖 (3) GraphQL 의 특징에는 뭐가 있을까?

### 👍🏻 특징 & 장점

1. url 설정하는데 시간이 거의 안 걸림
2. 단일 진입점이 존재 => '/graphql'
3. 데이터 유형이 엄격해서 통신 오류 적음
4. 쿼리 변화에 대한 유연성

### 👎🏻 단점!

- REST API와 너무 다른 방식이기 때문에 익히기 힘듦
- 데이터 쿼리의 상당 작업을 서버측으로 옮겨 서버 개발자 작업의 복잡성 증가

## 🤖 (4) GraphQL 작업유형 (operation type)

### GraphQL 타입 시스템에서 표현할 수 있는 타입 종류

1. query
  1. 데이터를 읽기 위한 작업 유형

    ```graphql
    query {
      getBook(id: "1") {
        title
        author
        publicationYear
      }
    }
    ```

    ```json
    {
      "data": {
        "getBook": {
          "title": "멋진 책",
          "author": "김윤지",
          "publicationYear": 2022
        }
      }
    }
    ```

2. mutation
  1. 데이터를 변경 또는 조작하기 위한 작업 유형

```graphql
mutation {
  createBook(input: {
    title: "greatest booook-!",
    author: "yunji kim",
    publicationYear: 2023
  }) {
    id
    title
    author
    publicationYear
  }
}
```

```json
{
  "data": {
    "createBook": {
      "id": "2",
      "title": "greatest booook-!",
      "author": "yunji kim",
      "publicationYear": 2023
    }
  }
}
```

## 🤖 (5)  GraphQL 그럼 어떻게 사용하지?

### 스프링에서 구현하려면,

1. 의존성 추가
  1. 프로젝트의 의존성 관리 파일에 GraphQL과 Spring GraphQL 관련 라이브러리를 추가
    - [graphql-java / graphql-java-spring](https://github.com/graphql-java/graphql-java-spring)
    - [graphql-java-kickstart / graphql-spring-boot](https://github.com/graphql-java-kickstart/graphql-spring-boot)
    - [Netflix / dgs-framework](https://github.com/Netflix/dgs-framework)

    ```java
    // build.gradle
    
    {
    		implementation 'com.graphql-java-kickstart:graphql-spring-boot-starter:11.0.0'
        implementation 'com.graphql-java-kickstart:playground-spring-boot-starter:11.0.0'
        testImplementation 'com.graphql-java-kickstart:graphql-spring-boot-starter-test:11.0.0'
    }
    ```

2. GraphQL 스키마 정의
  1. GraphQL 스키마를 정의하고 필요한 타입과 필드 작성
  2. 리소스 디렉토리(src/main/resources)

    ```graphql
    # user.graphql
    
    type Query {
        getUserInfo(id: String!): User
    }
    
    type User {
        id: String!
        nickname: String!
        point: Int!
        level: Int!
        status: String!
    }
    ```

3. 리졸버 구현
  1. 리졸버를 구현하여 클라이언트의 GraphQL 쿼리를 해석하고 데이터를 반환

    ```java
    // userQuery
    
    @Component
    public class UserQuery implements GraphQLQueryResolver {
    	
    	private final UserService userService;
    
    	public UserQuery(UserService userService) {
    		this.userService = userService;
    	}
    
    	public User getUserInfo(String id) {
    		User user = userService.getUserInfo(id);
    		return user;
    	}
    }
    ```

4. GraphQL 설정
  1. GraphQLServlet 또는 GraphQLHttpServlet을 등록하고 URL 매핑을 설정

    ```yaml
    // application.yml
    
    graphql:
      tools:
        schema-location-pattern: graphql/**/*.graphql
      servlet:
        cors:
        enabled: true
        mapping: /graphql
        max-query-depth: 100
        exception-handlers-enabled: true
    ```

5. 실행 및 테스트
  1. Spring 애플리케이션 실행하고 GraphQL 엔드포인트로 요청 보내 결과 확인