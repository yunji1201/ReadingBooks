package core.code.chap3._4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        // (방법 1) - try-catch-finally
        // 이렇게 처리할떄는 무조건 에러처리를 하라는 에러가 뜬다. ("파일이 없다면 어떻게할거야? 뭘 읽을거야?)
        // (1) throws FileNotFoundException 로 미루기 -> jvm이 처리하도록!
        // (2) try-catch 구문으로 감싸기
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/_1_core/code/chap3/_4_exception/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // FileNotFoundException 나옴!
        } finally {
            try {
                fis.close(); // 보통 이렇게 잘 닫아준다. 만약에 파일이 없다면 뭘 닫을건데? => 또 에러처리하기!
            } catch (IOException e) {
                e.printStackTrace(); // NullPointerException 나옴!
            }
            System.out.println("finally");
        }
        System.out.println("end");


        // (방법 2) - try-catch-resources
        // try 가로 안에서 아예 생성하고
        // finally 구문 필요없고
        // 대신 IOException 을 사용해야함
        try (FileInputStream fis2 = new FileInputStream("src/main/java/_1_core/code/chap3/_4_exception/a.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
