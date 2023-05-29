package core.code.chap3._3_inner_class.lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber maxNum = (x, y) -> (x >= y) ? x : y;
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);


        // MyNumber 메서드를 구현하고 호출하면 내부에서 익명 클래스가 이렇게 자동으로 생성된다
        int i = 100; // 멤버변수로 선언하기
        MyNumber test = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
//                i = 200;
                // 이렇게 하면 에러가 난다.
                // 멤버변수 i 보다, getMaxNumber 라이프사이클이 더 길기 때문에, 사용하고 싶다면 final로 선언해줘야한다! => final int i = 100;
                System.out.println(i); // 이렇게 참조는 할 수 있지만, 값은 바꿀 수 없다.
                return 0;
            }
        };
    }
}
