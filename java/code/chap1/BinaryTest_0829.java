package core.code.chap1;

public class BinaryTest_0829 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0B1010; //2진수
        int num3 = 012; //10진수
        int num4 = 0XA; //16진수

        System.out.println(num1 + num2 + num3 + num4);

        int num5 = 0B0000000000000000000000001101;
        int num6 = 0B1111111111111111111111111011;

        System.out.println(num5);
        System.out.println(num6);
    }
}
