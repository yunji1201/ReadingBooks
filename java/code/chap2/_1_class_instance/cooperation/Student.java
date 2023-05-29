package core.code.chap2._1_class_instance.cooperation;

public class Student {
    String studentName;
    int grade;
    int money;

    // 학생을 생성할 때 constructor(생생자)에서 매개변수를 받겠다
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) { // bus 정보를 받아와야지
        bus.take(1000);
        money -= 1000;
    }

    public void takeSubway(Subway subway) { // bus 정보를 받아와야지
        subway.take(1500);
        money -= 1500;
    }

    public void takeTaxi(Taxi taxi) { // bus 정보를 받아와야지
        taxi.take(5000);
        money -= 5000;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은" + money + "입니다");
    }
}
