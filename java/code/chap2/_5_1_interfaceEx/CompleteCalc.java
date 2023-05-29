package core.code.chap2._5_1_interfaceEx;

public class CompleteCalc extends Calculator {
    // 구현상속
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return ERROR;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다");
    }
}

// class extends - 구현상속
// interface implements - 타입상속