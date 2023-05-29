package core.code.chap2._1_class_instance.reference;

public class Student {
    int id;
    String stuName;
//    int koreaScore;
//    int mathScore;
//    String koreaSub;
//    String mathSub;

    Subject korea;
    Subject math;

    public Student() {
        korea = new Subject("국어");
        math = new Subject("수학");
    }

    public Student(int id, String name) {
        id = id;
        stuName = name;
        korea = new Subject("국어");
        math = new Subject("수학");
    }

    public void setKorea(int score) {
        korea.setScore(score);
    }

    public void setMath(int score) {
        korea.setScore(score);
    }

    public void showStudentInfo() {
        int total = korea.getScore() + math.getScore();
        System.out.println(stuName + " 학생의 총점 : " + total);
    }
}
