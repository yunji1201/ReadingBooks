package core.code.chap3._5_io.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/main/java/core/code/chap3/writer/writer.txt")) {
            fw.write("A");
            char[] cbuf = {'A', 'B', 'C'};
            fw.write(cbuf);
            fw.write("안녕하세요");
            fw.write("123");
            fw.write(cbuf, 2,3);
        } catch (IOException e) {
        }
        System.out.println("end");
    }
}
