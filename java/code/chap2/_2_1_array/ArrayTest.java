package core.code.chap2._2_1_array;

public class ArrayTest {
    public static void main(String[] args) {

        int num = 10; // 변수 초기화
        int nuimbers[] = new int[10];
        int[] numbers2 = new int[]{0, 1, 2}; // 초기화 할 때의 메모리크기 결정
        int[] numbers3 = {0, 1, 2};

        int[] numbers4 = new int[3];
        numbers4[0] = 1;
        numbers4[1] = 2;
        numbers4[2] = 3;

        for (int i = 0; i < numbers4.length; i++) {
            System.out.println(numbers4[i]);
        }

    }
}
