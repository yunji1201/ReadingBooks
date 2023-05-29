package core.code.chap3._5_io.Decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {
    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("src/main/java/core/code/chap3/Decorator/reader.txt")) { // 다 꺠진다 => 보조스트림 사용한다.
        try (InputStreamReader irs = new InputStreamReader(new FileInputStream("src/main/java/core/code/chap3/Decorator/reader.txt"))) { // 보조스트림 사용
            int i = 0;
            while ((i = irs.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// inputStreamReader는 막상 직접 읽고 쓰는 기능은 없다.