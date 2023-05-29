package core.code.chap3._5_io.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FIleinputStreamTest2_1013 {

    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("src/main/java/core/code/chap3/InputStream/input2.txt")) { // 문자는 FileReader 로 읽는게 좋다
            byte[] bs = new byte[10];
            int i;
            while ((i = fis.read(bs)) != -1) {
                for (int j =0; j<i; j++) {
                    System.out.println((char) bs[j]); // garbage 안남게하려고
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}