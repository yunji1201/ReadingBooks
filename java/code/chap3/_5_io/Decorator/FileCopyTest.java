package core.code.chap3._5_io.Decorator;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {

        long mileseconds = 0;
        int len = 0;

        try (FileInputStream fis = new FileInputStream("a.exe");
             FileOutputStream fos = new FileOutputStream("b.exe");
             BufferedInputStream bis = new BufferedInputStream(fis); // 보조스트림
             BufferedOutputStream bos = new BufferedOutputStream(fos)) { // 보조스트림

            mileseconds = System.currentTimeMillis();
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
                len++;
            }
            mileseconds = System.currentTimeMillis() - mileseconds;
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(len);
        System.out.println(mileseconds);

    }
}
