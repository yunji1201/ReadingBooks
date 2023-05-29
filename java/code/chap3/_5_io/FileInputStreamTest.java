package core.code.chap3._5_io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/input.txt");
//            System.out.println(fis.read()); // 이러면 하나씩 읽혀진다
//            System.out.println("/////////////////");
//            System.out.println((char) fis.read());

            // 한글자씩 말고 다 읽고 싶다면?

            int i = 0;

            while ((i = fis.read()) != -1) {
                // 끝날때는-1d을 반환한다.
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);// close  하는데도  exception 될 수 있으니까 try-catch 해주기
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("the end");
    }
}

// 정상적으로 수행된 것
//> Task :FileInputStreamTest.main()
//        java.io.FileNotFoundException: input.txt (지정된 파일을 찾을 수 없습니다)
//        java.lang.NullPointerException
//        the end