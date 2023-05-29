package core.code.chap2._1_class_instance.classPart;

public class StudentTest {
    public static void main(String[] args) {
        Student yunji = new Student();
        // 참조형 데이터 타입 : Student
        // 참조변수 : yunji
        yunji.studentName = "yunjiKim";
        yunji.address = "seoul";
        yunji.grade = 27;
        yunji.studentId = 961201;

        yunji.showStudentInfo();

        // yunji : 참조변수
        System.out.println(yunji); // core.code.chap2.class_instance.classPart.Student@5a61f5df : 위치 주소값 (참조값)
    }
}

// 보통은 테스트코드는 다른 클래스에 이렇게 만든다.