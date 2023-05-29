package core.code.chap1;

public class OperationEx_0906 {

    public static void main(String[] args) {

        int num = 10;
        int i = 2;

        boolean value = (((num = num + 10)) < 10) && (((i = i + 2)) > 10); // 둘다 true여야 true -> 뒤에 연산 필요없음

        System.out.println(value);
        System.out.println(num);
        System.out.println(i);

        int num1 = 10;
        System.out.println(num1 += 1);
        System.out.println(num1 %= 10);

        int a = 5;  //00000101
        int b = 10; //00001010
        System.out.println(a & b); // 00000000 => 겹치는게 없으니 0

        int c = 5;  //00000101
        int d = 10; //00001010
        System.out.println(c | d); // 00001111 => 겹치는게 있으니 1

        System.out.println(15 << 2); // 15는 00001111 인데 왼쪽으로 2번 이동 => 00111100 으로 되니까 => 60

        int e = 5;
        System.out.println(e << 3); // 2의 3승은 8 * 5 = 40;
    }
}

