package core.code.chap3._5_io.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100); // 4바이트
        System.out.println(rf.getFilePointer()); // 파일 포인터 위치 출력
        rf.writeDouble(3.14); // 8바이트
        System.out.println(rf.getFilePointer());
        rf.writeUTF("안녕하세요"); // 3 * 5 + 2(2바이트인 null이 들어감) = 17
        System.out.println(rf.getFilePointer());

        rf.seek(0); // 맨앞으로 간다 // 맨 앞으로 가야지 읽을 수 있지

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
