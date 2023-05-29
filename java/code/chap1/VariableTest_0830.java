package core.code.chap1;

public class VariableTest_0830 {

    public static void main(String[] args) {

        int num;
        num = 10; // 값을 대입
        // 오른쪽에 있는 값을 왼쪽에 대입한다

        int level = 20;
        System.out.println(level);

        byte bData = -128;
        System.out.println(bData);

        byte bData2 = 127;
//        byte bData3 = 128; //127까지만 바이트로 표현가능. 그래서 에러가 난다.

// 자바에서 모든 숫자들은 정수, int 형으로 저장한다.
// 그런데 너무 큰 숫자라면 int에 넣으면 에러 발생 - Integer number too large

//        int num2 = 13245678900;

//        그러면 보통 long으로 써준다
//        long num3 = 12345678900;

//        근데 이게 저 숫자 자체를 저장하는게 4바이트(int)라는거여서 컴파일러에게 8바이트로 저장하라고 말해야함
        long num4 = 12345678900L; // 뒤에 L을 붙여준다.


        char ch = 'A';
        System.out.println(ch); // A
        System.out.println(ch); // 65
        // 음수는 안된다

        int ch2 = 67;
        System.out.println(ch2); //67
        System.out.println((char) ch2); // C

        double dNum = 3.14; //8b
//        float fNum = 3.14; // 4b ->  float 로 쓸때 기본적으로 double 로 저장이 되어서 뒤에 F를 꼭 써줘야한다
        float fNum2 = 3.14F; // 4b


    }
}
