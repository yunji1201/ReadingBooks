package core.code.chap3._3_inner_class.lambda;

@FunctionalInterface // 컴파일 에러를 막기위한 어노테이션도 붙여주면 좋다.
public interface MyNumber {
    int getMaxNumber(int num1, int num2);
//    int testNumber(int x, int y);
    // 람다식을 위한 함수형 인터페이스는 무조건 그 안에 메서드가 하나여야한다. 두개 이상이면 어떤 함수를 호출하는건지 몰라서 에러가 나온다.
}