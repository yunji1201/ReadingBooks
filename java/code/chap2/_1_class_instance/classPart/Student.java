package core.code.chap2._1_class_instance.classPart;

public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;

    public Student() {
    } // default 생성자 / 자바 컴파일러에서 자동으로 추가된다 / 매개변수 없고 구현로직 없음 / 만약 내가 필요하면 직접 만들어도 상관없음
    // 생성자 왜 있어?
    // 가장 기본적인걸 구현하기 위해서.
    // Student 객체가 생성될때 나는 무조건 이름과 아이디는 무조건 전달 받아서 생성하고 싶어.
    // 예시) public Student(int id, String name){studentId = id; studentName = name;};
    // 생성자 오버로딩

    public void showStudentInfo() {
        System.out.println(studentName + " : " + address);
    }

    public String getName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

//    public static void main(String[] args) {
//        Student yunji = new Student();
//        // 참조형 데이터 타입 : Student
//        // 참조변수 : yunji
//        yunji.studentName = "yunjiKim";
//        yunji.address = "seoul";
//        yunji.grade = 27;
//        yunji.studentId = 961201;
//
//        yunji.showStudentInfo();
//    }
}
