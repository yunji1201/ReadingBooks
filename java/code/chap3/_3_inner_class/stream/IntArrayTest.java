package core.code.chap3._3_inner_class.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        IntStream stream = Arrays.stream(arr);

        int sum = stream.sum();
        System.out.println(sum);

//        int count = (int) stream.count(); // 값이 안나온다. 스트림은 한 번 사용하면 소모되기 때문에. 무조건 다시 생성해야 한다!
        int count = (int) Arrays.stream(arr).count(); // 이렇게!
        System.out.println(count);
    }
}
