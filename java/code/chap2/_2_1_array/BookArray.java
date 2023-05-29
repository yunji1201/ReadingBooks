package core.code.chap2._2_1_array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        // 책이 5개 만들어지는 거 X
        // 메모리가 들어가는 주소 자치를 5개 만드는거!

        // 기본자료형은 10개 하면 바로 사용 할 수 있지만,
        // 객체자료형은 객체를 10개 생성해서 배열에다가 다시 넣어야한다!

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

    }
}
