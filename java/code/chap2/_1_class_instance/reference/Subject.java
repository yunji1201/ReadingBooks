package core.code.chap2._1_class_instance.reference;

public class Subject {

    String subjectName;
    int score;

    public Subject(String name){
        subjectName = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
