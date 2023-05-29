package core.code.chap3._5_io.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for (int i = 0; i < bs.length; i++) {
            bs[i] = data++;
        }

        try (FileOutputStream fos = new FileOutputStream("src/main/java/core/code/chap3/OutputStream/output3.txt")) { // 이렇게 계속 run 돌리면 덮어쓰기 기반이라서 내용 변함없음.
            // 그런데 이걸 계속 연결해서 쓰고 싶으면 파일명 뒤에 true라고 적어야함. default값은 false.
            fos.write(65); // A
            fos.write(66); // B
            fos.write(67); // C - fileoutputStream은 아스키코드에 대응하는 값이 나옴. 진짜 숫자 '65'를 쓰려면 다른 방식으로 써야함.

//            fos.write(bs);
            fos.write(bs,2,10); // 2번째부터 10개만 써라

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
