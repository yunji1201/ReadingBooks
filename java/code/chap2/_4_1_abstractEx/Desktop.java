package core.code.chap2._4_1_abstractEx;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("desktop display ------------>");
        // 하위클래스는 구현에 대한 책임이 있다.
    }

    @Override
    public void typing() {
        System.out.println("desktop typing ------------>");
    }

    public void turnOn() {
        System.out.println("이미 상위클래스에서 구현된 것도 하위클래스에서 새롭게 오버라이딩해서 자기입맛에 맞게 구현할 수 있음");
    }
}
