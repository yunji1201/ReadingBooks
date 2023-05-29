package core.code.chap2._5_1_interfaceEx;

public abstract class Calculator implements Calc {
// 인터페이스를 상속받았다 => '타입상속'

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override // 다르게 재정의하기
    public void description() {
        System.out.println("완벽한 계산기입니다");
    }
}
