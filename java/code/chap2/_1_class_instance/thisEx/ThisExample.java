package core.code.chap2._1_class_instance.thisEx;

class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
        // 클래스에서 멤버변수는 다른 색으로 표시됨
        // 내가 하고 싶은건 멤버변수의 year과 setYear의 지역변수인 year가 같다고 하고 싶은데
        // 그냥 year = year; 이렇게 해버리면
        // 변수는 제일 가까운걸 참조하니까 둘다 setYear의 지역변수인 year을 참고하게 되어 무의미한 코드가 된다.
        // 그러므로 그럴때는 꼭 year을 붙여줘야한다!
    }

    public void printThis() {
        System.out.println(this);
    }
}


public class ThisExample {
    public static void main(String[] args) {
        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        System.out.println(b1);
        b1.printThis();
        System.out.println(b2);
        b2.printThis();
    }


}
