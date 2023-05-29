package core.code.chap2._4_1_abstractEx;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer c1 = new Computer(); // 추상클래스는 인스턴스화 안된다
        Computer c2 = new Desktop(); // 상위클래스 타입으로 만들어질 수 있다
//        Computer c3 = new Notebook(); // 추상클래스는 인스턴스화 안된다
        Computer c4 = new Mynote();
        Notebook c5 = new Mynote(); // 이것도 가능


        c2.display();
        c4.display();
        c5.testmethod(); // 이 메소드는 얘만 가지고 있음 왜냐면 이친구만 타입이 notebook이니까!

    }
}
