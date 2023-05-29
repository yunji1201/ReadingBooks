package core.code.chap1;

public class LoopOperation_0914 {

    public static void main(String[] args) {

        //while문
        int num = 1;
        int sum = 0; // 초기화 필요

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다");
        // while(true){ } 라고 하면 무한루프를 돈다. 항상 참이니까. 웹서버에서는 항상 켜둬야하니까 보통 이렇게 한다는데? 계속 돌려야할 필요가 있을 떄는 이렇게 사용한다.


        // do-while문
//        do {
//            sum += num;
//            num++;
//        } while (num <= 10) {
//            System.out.println("1부터 10까지의 합은 " + sum + "입니다");
//        }
    }

}

// 블럭이 시작되면 들여쓰기를 해야한다!