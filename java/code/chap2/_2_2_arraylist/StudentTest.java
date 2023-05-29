package core.code.chap2._2_2_arraylist;

public class StudentTest {
    public static void main(String[] args) {
        Studnet yunji = new Studnet(1201, "yunji");
        yunji.addSubject("국어", 100);
        yunji.addSubject("수학", 90);
        yunji.addSubject("영어", 95);

        yunji.showStudentInfo();

        System.out.println("===============================");

        Studnet test = new Studnet(1111, "yuljeon");
        test.addSubject("국어", 50);
        test.addSubject("수학", 100);
        test.addSubject("영어", 80);

        test.showStudentInfo();
    }
}
