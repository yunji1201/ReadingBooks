package core.code.chap2._4_2_template1;

public abstract class Car {

    public abstract void drive();

    public abstract void stop();

    public abstract void wiper();

    public void washCar(){} // 구현을 했는데 구현코드가 없는거 (훅 메소드?)
    
    
    public void startCar() {
        System.out.println("시동을 켭니다");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다");
    }

    // 템플릿 메서드가 되는거지
    // 모든 동작이 이 시나리오로 흘러가니까
    // 하위클래스에서 재정의할수없다. 템플릿으로 정해져있는거니까. 일련의 과정, 순서를 정해놓은 메서드
    public final void run() { // 템플릿 메서드 키워드 => "final"
        // final public void run() 이라고 써도 된다. final위치 앞뒤 상관없음
        startCar();
        wiper();
        drive();
        stop();
        washCar(); //구현코드없음 -> 실제로 돌아가는 코드 없음 - 내가 맘대로 재정의해서 사용하는거임
        turnOff();
    }
}
