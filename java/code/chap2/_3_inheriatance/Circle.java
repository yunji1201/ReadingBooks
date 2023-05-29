package core.code.chap2._3_inheriatance;

public class Circle {

//    private int x;
//    private int y;
//    내가 사용하려는 애들이 point에 있으니까!

    Point point;
    private int radius;

    public Circle() {       // has a 관계
        point = new Point();
    }
}
