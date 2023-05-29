package core.code.chap1;

public class ConstantTest_0903 {

    public static void main(String[] args) {

        final int MAX_NUM = 200;
        final float PI = 3.14F;

//      MAX_NUM = 300; // 이라고하면 에러가 나지. 상수인데 값을 바꿔서 넣으려고 하니까.

        final int STU_NUM = 30;

        int num = 0;
        if (num == STU_NUM) {
            System.out.println(STU_NUM);
        }

        // ==================================================================

        // 자연스럽게 일어나는 "묵시적 형변환" Implicit
        byte bNum = 10;
//        int num = bNum; // 작은메모리에서 큰메모리

        long lNum = 10;
        float fNum = lNum; // 덜 정밀에서 정밀! => 10.0

        double dNum = fNum + num; // double 로 형변환이 나온다 => 20.0

        // "명시적 형변환" Explicit

        int iNum = 1000;
//        byte bNum = iNum; // 명시적으로 해야함
        byte bNum2 = (byte) iNum; //  바이트

//        double dNum = 3.14;
//        iNum = dNum; // 명시적으로 해야함
        iNum = (int) dNum; // 3 (실수부분은 사라지고 정수부분만 남는다)

        float ffNum2 = 0.9F;

        int num1 = (int) dNum + (int) ffNum2; //3+0 = 3
        int num2 = (int) (dNum + ffNum2); //3.14+0.9 = 4.0~ = 4
        // 둘의 결과가 다르다


    }
}
