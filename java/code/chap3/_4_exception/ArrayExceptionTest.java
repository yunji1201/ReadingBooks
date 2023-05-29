package core.code.chap3._4_exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
                // 예외걸림 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // 이쪽에 로그 남기기!
            System.out.println(e);
//            return;
        } finally {
            System.out.println("finally"); // 파이널리는 try 구문이 실행되면, 어떤 경우라도 무조건 시스템이 죽더라도 무조건 실행이 된다.
        }
        System.out.println("end"); // 시스템이 죽었다면 이 부분은 실행되지 않았을 것이다.
    }
}
