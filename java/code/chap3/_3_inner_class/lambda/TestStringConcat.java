package core.code.chap3._3_inner_class.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        // 객체지향으로 (인터페이스와 impl 모두 사용하여)
        StringConcat sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        // 람다로 한다면?
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("hello", "java");

        // 다른식으로 사용해보기

        StringConcat sc = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };
        sc.makeString("hello", "java");
    }
}
