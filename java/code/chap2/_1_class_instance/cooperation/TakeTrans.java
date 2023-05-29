package core.code.chap2._1_class_instance.cooperation;

public class TakeTrans {

    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);
        Student yunji = new Student("Yunji", 80000);
        Student yul = new Student("Yul", 50000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        tomas.takeSubway(subwayGreen);
        tomas.showInfo();
        subwayGreen.showInfo();

        Taxi kakakoTaxi = new Taxi(9091);
        yunji.takeTaxi(kakakoTaxi);
        yunji.showInfo();
        kakakoTaxi.showInfo();

        yul.takeTaxi(kakakoTaxi);
        yul.showInfo();
        kakakoTaxi.showInfo();
    }
}
