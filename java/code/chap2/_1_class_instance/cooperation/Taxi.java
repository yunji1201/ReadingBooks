package core.code.chap2._1_class_instance.cooperation;

public class Taxi {

    int taxName;
    int passengerCount;
    int money;

    public Taxi(int taxName) {
        this.taxName = taxName;
    }

    public void take(int money) { // 승객이 한명 탑승할떄마다 호출되는 메소드
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("택시" + taxName + "의 승객은" + passengerCount + "명이고,수입은 " + money + "입니다");
    }
}
