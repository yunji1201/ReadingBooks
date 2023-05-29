package core.code.chap3._4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        // 아래 둘다 각각 다른 Exception 처리를 해주어야 한다
        // 그래서 그걸 미루기 위해 throws 처리를 한 것!
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        // 위쪽에서 핸들링을 따로 안하고 throws로 미뤘기때문에 쓰는 쪽에서 직접 핸들링해야한다.
        ThrowsException ex = new ThrowsException();
        try {
            ex.loadClass("src/main/java/_1_core/code/chap3/_4_exception/a.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) { // 다중 예외 처리 시 주의 : 어떤 에러가 떨어질지 모르면 이렇게 디폴트로 Exception 상위 클래스로 해줘도 된다. 그렇지만 이걸 사용할 때는 무조건 맨 마지막에 쓰기!!
            System.out.println(e);
        }
        System.out.println("end");
    }
}
