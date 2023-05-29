package core.code.chap2._1_class_instance.reference;

public class Circle {
    Point point; // int x, int y 안 써도 돼. Point쪽에서 가져오니까.
    int radius;

    public Circle() {
        point = new Point(); // 클래스안에다 다른 클래스 가져다 쓰는 참조자료형
    }
}
