package core.code.chap2._5_4_interfaceInheritance;

public class MyClass implements Test {
    @Override
    public void test() {
        System.out.println("test()");
    }

    @Override
    public void x() {
        System.out.println("x()");

    }

    @Override
    public void y() {
        System.out.println("y()");

    }

    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.x();
        my.y();
        my.test();
        // my 는 모든 메소드를 사용할 수 있다

        X xClass = my;
        xClass.x();
        // X 타입이므로 오직 x() 메소드만 사용할 수 있다

    }
}
