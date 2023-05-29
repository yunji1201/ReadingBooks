package core.code.chap2._1_class_instance.staticEx;

public class Student {

    //    static int serialNum = 10000;
    private static int serialNum = 10000; // private를 하면 getter, setter 사용해서 다른 클래스에서 사용

    int studentId;
    String studentName;

    public Student() { // 학생이 증가할 때마다 늘어나는 constructor
        serialNum++;
        studentId = serialNum;
    }

    public static int getSerialNum() {
        int i = 10; // 지역변수 (이곳에서만 사용하는 변수) 아무렇게나 사용, 아무렇게나 로직 작성 해도 되는데
//        studentName = "홍길동"; // 멤버변수, 인스턴스 변수 - static 메소드 안에서는 멤버변수, 인스턴스 변수를 사용할 수 없다 -> 오류남
        return serialNum; // static 변수, 클래스 변수
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
