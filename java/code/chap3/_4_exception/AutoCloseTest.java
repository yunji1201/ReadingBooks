package core.code.chap3._4_exception;

public class AutoCloseTest {
    public static void main(String[] args) {

        // try-catch-resources 구문
        // 가로 안에 객체 즉, AutoCloseObj가 AutoClosable() 메서드를 제공하면 된다.
        try (AutoCloseObj obj = new AutoCloseObj()) {
            throw new Exception(); // 예외를 강제로 처리하는거
        } catch (Exception e) {
            System.out.println("exception 불림");
        }

    }
}
