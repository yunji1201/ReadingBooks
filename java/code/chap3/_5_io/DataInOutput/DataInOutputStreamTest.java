package core.code.chap3._5_io.DataInOutput;

import java.io.*;

public class DataInOutputStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/main/java/core/code/chap3/DataInOutput/data.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.write(100);
            dos.writeInt(10);
            dos.writeChar('A');
            dos.writeUTF("hello");
        } catch (IOException e) {
            System.out.println(e);
        }
        try (FileInputStream fis = new FileInputStream("src/main/java/core/code/chap3/DataInOutput/data.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.read());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}