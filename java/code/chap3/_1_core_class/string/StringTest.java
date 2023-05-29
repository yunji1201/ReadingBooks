package core.code.chap3._1_core_class.string;

public class StringTest {
    public static void main(String[] args) {
        String st1 = new String("abc");
        String st2 = new String("abc");
        System.out.println(st1 == st2); // false

        String st3 = "abc";
        String st4 = "abc";
        System.out.println(st3 == st4); // true -> 이렇게 문자열 상수를 직접 넣게되면 그때는 true이다!

        String st5 = new String("java");
        System.out.println(System.identityHashCode(st5)); // 1308927845
        String st6 = new String("android");
        st5 = st5.concat(st6);
        System.out.println(st5); // javaandroid 붙었다
        System.out.println(System.identityHashCode(st5)); // 2017354584
        // 그렇지만 문자열 자체는 변한게 아니다.
        // javaandroid가 새로운 인스턴스가 생성된거고 st5가 그걸 가르키도록 변한거다
        // 그래서 identityHashCode로 원초적인 주솟값을 각각 찍어보면 달라진 것을 알 수 있다.
        // 그러므로 문자열 연결을 계속하면 메모리에 gabage가 많이 생길 수 있음
        // 그래서 사용하는게 바로 StringBuilder, StringBuffer!!


    }
}
