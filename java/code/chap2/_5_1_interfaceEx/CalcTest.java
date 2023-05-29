package core.code.chap2._5_1_interfaceEx;

public class CalcTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        Calc calc = new CompleteCalc();
        // completeCalc 는 Calc 타입이다
        System.out.println(calc.add(num1, num2));

        // 안되는것 => 추상클래스라서 인스턴스 생성이 안되지요
//        Calc calc2 = new Calc();
//        Calc calc3 = new Calculator();

        // 되는 것
        CompleteCalc calc4 = new CompleteCalc(); // 타입이 completeCalc임
        Calculator calc5 = new CompleteCalc(); // 타입이 Cacculator임

        calc.description();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
