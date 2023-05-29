package core.code.chap2._2_2_arraylist;

import java.util.ArrayList;

public class Studnet {
    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectList; // 학생이 여러과목을 수강하니까 arrayList로 묶어서

    public Studnet(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getScorePoint();
            System.out.println("학생 " + studentName + "님의 " + subject.getName() + "과목의 성적은 " + subject.getScorePoint() + "점 입니다.");
        }
        System.out.println("학생 " + studentName + "님의 총점은 " + total + "점 입니다.");
    }
}
