package core.code.chap1;

public class StudentTest_0829 {

    int studentId;
    String name;
    int grade;
    String address;

    public void showInfo() {
        System.out.println(name + " : " + address);
    }

    public static void main(String[] args) {
        StudentTest_0829 stu = new StudentTest_0829();
        stu.name = "yunji";
        stu.address = "seoul";

        stu.showInfo();
    }
}
