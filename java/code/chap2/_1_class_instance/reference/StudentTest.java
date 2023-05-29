package core.code.chap2._1_class_instance.reference;

public class StudentTest {

    public static void main(String[] args) {
        Student yunji = new Student(961201, "윤지");
        yunji.setKorea(100);
        yunji.setMath(100);

        yunji.showStudentInfo();
    }
}
