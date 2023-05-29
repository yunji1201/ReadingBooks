package core.code.chap3._5_io.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FIleinputStreamTest_1013 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        int i = 0;
        try {
            fis = new FileInputStream("src/main/java/core/code/chap3/InputStream/input.txt"); // 문자는 FileReader 로 읽는게 좋다

            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }


            fis.read(); // 한 바이트씩 읽기
            System.out.println((char) fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        System.out.println("end");
    }
}

