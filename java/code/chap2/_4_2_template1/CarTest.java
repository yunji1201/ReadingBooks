package core.code.chap2._4_2_template1;

public abstract class CarTest {

    public static void main(String[] args) {
        Car myCar = new ManualCar();
        myCar.run();

        System.out.println("////////////////////////////");

        Car aiCar = new AICar();
        aiCar.run();
    }
}
