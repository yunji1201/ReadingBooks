package core.code.chap2._1_class_instance.cooperation;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber; // 여기 그냥 변수명 다르게 하면 this 안 써도 되지만 파라미터값과 이름을 같게 해야지 가독성에 좋다.
    }

    public void take(int money) { // 승객이 한명 탑승할떄마다 호출되는 메소드
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("지하철" + lineNumber + "호선의 승객은" + passengerCount + "명이고,수입은 " + money + "입니다");
    }
}
