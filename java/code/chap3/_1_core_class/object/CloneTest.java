package core.code.chap3._1_core_class.object;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 5);
        Circle cloneCircle = (Circle) circle.clone(); //  강제로 다운캐스팅을 해야함

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(cloneCircle)); // 이렇게하면 에러발생! CloneNotSupportedException이 발생한다 그러므로 Circle 클래스에 "implements Cloneable"를 해주어야함
        // 결과는 서로다른 해시코드 값이 나오게 된다!

        System.out.println(circle);
        System.out.println(cloneCircle);
        // 같은 toString값이 나오지만 인스턴스는 다르니까 다른 해시코드 값을 가진다!
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x =" + x + " , " + "y =" + y;
    }
}

class Circle implements Cloneable {
    Point point;
    private int radius;

    public Circle(int x, int y, int radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    public String toString() {
        return "원점은 " + this.point + ", 반지름은 " + radius + "이다";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}