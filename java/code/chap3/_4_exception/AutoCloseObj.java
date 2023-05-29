package core.code.chap3._4_exception;

public class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close() 호출됨");
    }
}
