package core.code.chap3._3_inner_class.lambda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        // (1) 변수에 대입해서 바로 implements 하는 방법
        PrintString lambdaPrint = str -> System.out.println(str); // 메서드를 변수처럼 사용하기
        lambdaPrint.showString("test");

        showMyString(lambdaPrint);

        PrintString reStr = returnPrint();
        reStr.showString("hello");
    }

    // (2) implements한 방식이 바로 매개변수로 넘어가는 방법
    public static void showMyString(PrintString lambda) { // 위에 main이 static이니까 이것도 static 메서드로 만들어야함
        lambda.showString("test2");
    }

    // (3) implements한 방식으로 바로 반환값으로 넘기는 방법
    public static PrintString returnPrint() {
        return s -> System.out.println(s + " world");
    }
}
