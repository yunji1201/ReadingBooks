package core.code.chap1;

public class IfExample_0914 {

    public static void main(String[] args) {

        int age = 2;

        if (age >= 8) {
            System.out.println("학교에 다닙니다");
        } else {
            System.out.println("학교에 안다닙니다");
        }


        int rank = 1;
        String medalColor;

        switch (rank) {
            case 1:
                medalColor = "Gold";
                break;                      // switch-case문에서는 무조건 break를 써줘야 한다. 그렇지않으면 빠져나오지 못하고 아래를 계속 타게 된다.
            case 2:
                medalColor = "Silver";
                break;
            case 3:
                medalColor = "Bronze";
                break;
            default:
                medalColor = "A";
        }
        System.out.println(rank + " 의 메달 색은 " + medalColor + " 입니다");

        int month = 3;
        int day = 0;

        switch (month) {
            case 1: case 3: case 5:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6:
                day = 30;
                break;
            default:
                break;
        }
        System.out.println(month + "월은 " + day + "일까지 입니다");
    }

}

// 블럭이 시작되면 들여쓰기를 해야한다!