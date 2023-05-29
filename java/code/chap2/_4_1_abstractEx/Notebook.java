package core.code.chap2._4_1_abstractEx;

public abstract class Notebook extends Computer {

    @Override
    public void display() {
        System.out.println("Notebook display ------------>");

    }

    public void testmethod() {
        System.out.println("테스트메소드 입니다만;");
    }
}
