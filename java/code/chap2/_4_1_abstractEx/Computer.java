package core.code.chap2._4_1_abstractEx;

public abstract class Computer {

    public abstract void display(); // 하위클래스에게 구현을 위임시켰다

    public abstract void typing();

    // public void display();
    // => 구현코드(바디)가 없으면 추상메서드가 된다.
    // 메서드를 이렇게 쓰면 구현안하고 "선언"만 한다
    // 그럴때는 이제 public abstract void~ 이렇게 추상메서드인걸 써야함
    // 근데 그럼 왜 추상클래스를 쓸까?
    // => 상속을 하기 위해서
    // 자기혼자 돌아가는 것 아님
    // 인스턴스화 될 수 없음

    // 이 abstract class 안에는 추상메서드랑 추상메서드가 아닌것을 모두 쓸 수 있음.
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
