package core.code.chap2._1_class_instance.hiding;

class BirthDay {

    private int day;
    private int month;
    private int year; // public 으로 하면 다 참조가능하겠지. 근데 그러면 무결성이 침범될 수 있다.

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        // 이렇게 안에서 로직처리하려면 private 해야지
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("날짜 오류입니다.");
            }
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) { //set을 못하게 막아두면 readonly 할 수 있다
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BirthDayTest {

    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        day.setMonth(2); // 대신 맨 처음에 써야지 (month로 분기처리되어있으니까)
        day.setDay(30);
        day.setYear(2022);
    }
}