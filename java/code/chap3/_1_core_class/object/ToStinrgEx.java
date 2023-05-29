package core.code.chap3._1_core_class.object;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // 나도 재정의하기! 메모리주솟값말고 String값 내보내고싶으니까!

    @Override
    public String toString() {
//        return super.toString(); -> 이게 원형
        //난 근데 재정의할거야
        return title + "," + author; // 정보 출력할때 이렇게 자주 사용된다
    }
}

public class ToStinrgEx {
    public static void main(String[] args) {
        Book book = new Book("책제목", "작가이름");
        System.out.println(book); // Book@783e6358

        String str = new String("이건 메모리주솟값으로 안나오지용");
        System.out.println(str);

        // String에는 toString 메서드가 이미 재정의 되어있기 때문에 이름'String' 만 제대로 나올 수 있는것
    }
}