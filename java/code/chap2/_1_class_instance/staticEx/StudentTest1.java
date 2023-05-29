package core.code.chap2._1_class_instance.staticEx;

public class StudentTest1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println(student1.studentId);


        Student student2 = new Student();
        System.out.println(student2.studentId);


//        System.out.println(student1.serialNum);
//        System.out.println(student2.serialNum);
//
//        System.out.println(Student.serialNum); // 그런데 보통 static 변수는 참조변수를 안쓴다. stduent2 이렇게 안쓰고 Student 자체를 사용하는 편

        System.out.println(Student.getSerialNum());

    }
}
