package core.code.chap3._3_inner_class.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s, String s2) {
        if (s.getBytes().length <= s2.getBytes().length) return s2;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요", "hello", "반갑습니다", "good morning"};

        System.out.println(
                Arrays.stream(greetings) // 스트림 생성
                        .reduce("", (s1, s2) -> { // 람다식
                            if (s1.getBytes().length >= s2.getBytes().length) return s1;
                            else return s2;
                        }));

        String str = Arrays.stream(greetings).reduce(new CompareString()).get(); // get() : 값을 가져오기
        System.out.println(str);
    }
}
