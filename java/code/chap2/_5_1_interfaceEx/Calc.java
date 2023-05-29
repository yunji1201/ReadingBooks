package core.code.chap2._5_1_interfaceEx;

public interface Calc {
// interface안에서는 모두 추상메서드만!

    // 멤버변수 선언가능
    double PI = 3.14; // 이렇게만 써도 "public static final", 즉 상수로된다.
    int ERROR = -999999999;

    //설계
    // 뼈대를 만드는 것
    // 어떤게 필요하고 어떻게 쓰일지 미리 fix
    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    default void description() { // 여기에 무조건 default 추가해야함 => 구현코드를 가질 수 없으니까 defualt나 private으로 바꿔야함
        System.out.println("정수 계산기를 구현합니다");
    }

    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
}

