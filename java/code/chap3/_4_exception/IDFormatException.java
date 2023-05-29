package core.code.chap3._4_exception;

public class IDFormatException extends Exception {
    public IDFormatException(String message) {
        super(message); // 여기에서 super는 extends한 상위클래스인 Exception 말하는거
    }
}
