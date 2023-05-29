package core.code.chap3._3_inner_class;

class OutClass { // 외부클래스
    private int num = 10; // 멤벼변수
    private static int sNum = 20;
    InClass inClass;

    public OutClass() { // 외부클래스의 생성자, 그 안에서 내부클래스를 보통 생성한다.
        inClass = new InClass();
    }

    private class InClass { // 내부클래스 = instance inner class  // 멤버변수랑 같은 위치에 존재
        // 내부클래스는 내부에서만 사용하므로 private 으로 선언되는게 맞을 것!
        int inNum = 200;

        // static int sInNum = 100; - 사용불가
        // static은 인스턴스 생성과 상관없이 어디서든 호출해야하는데 인스턴스이너클래스 자체는 아웃클래스가 생성되어야지 그 다음에 생성되니까 static 사용 불가

        // 메서드 하나 생성
        void inTest() {
            // 모든 내부 클래스는 외부클래스에 대한 참조를 가지고 있다
            // 외부클래스의 모든 변수를 사용할 수 있다.
            System.out.println(num);
            System.out.println(sNum);
        }

        // static void sTest(){ } - 이것도 사용 불가 -> 내부클래스내에서 static 메서드, static 변수는 사용 못함
    }

    public void usingInTest() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
//            num += 10;
            // num 은 outClass의 인스턴스 변수이다
            // 그렇지만 현재 클래스는 static이기 때문에 아웃클래스가 아직 로딩되지않았을때도 만들어질 수 있다. 그래서 num을 못쓰는 것
            // 외부클래스의 인스턴스 변수는 못쓴다.
            // 대신 sNum은 사용할 수 있다.
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum); // sInNum이 생성되었다는것은 인스턴스 내부변수가 생성되었다는거라서 사용 가능
            System.out.println(sInNum); // 정적 내부 클래스의 정적변수니까 사용가능
        }

        static void sTest() { // static 메서드
            System.out.println(sNum);
//            System.out.println(iNum); // InStaticClass와는 상관없이 sTest()메서드는 그냥 호출되는 것 -> 그러므로 InStaticClass 클래스의 멤버변수 사용 못함
            System.out.println(sInNum);

        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();

        // 내부클래스가 private이 아니라면!
//        outClass.inClass.inTest();
//
//        // 아웃클래스에 있는 인클래스 생성 방법 !!
//        OutClass.InClass inClass = outClass.new InClass();
//        inClass.inTest();

        // 그렇지만 보통 내부클래스는 private 이고, 외부클래스의 멤버변수들도 private 으로 하는게 일반적
        // 그러므로 사용을 하려면 위에 외부클래스에 usingInTest 메서드 같은걸 만들어 사용!

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        // 이친구는 static이라서 OutClass의 생성과는 상관없이 생성 될 수 있다.

        OutClass.InStaticClass.sTest(); // 그 무언가도 상관없이 생성, 사용가능 - 그 안에 있는 것들은 정적변수들
    }
}
