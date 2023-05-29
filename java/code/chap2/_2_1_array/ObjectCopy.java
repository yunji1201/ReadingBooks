package core.code.chap2._2_1_array;

public class ObjectCopy {
    public static void main(String[] args) {

        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];
        Book[] bookArray3 = new Book[3];

        bookArray1[0] = new Book("태백산맥1", "조정래");
        bookArray1[1] = new Book("태백산맥2", "조정래");
        bookArray1[2] = new Book("태백산맥3", "조정래");

        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
        //book1의 0부터 book2의 0부터 3개를
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }


        // < 얉은 복사 >
        System.out.println("/////////////// < 얉은 복사 > ////////////////");
        // bookArray1배열의 첫번째 요소의 이름을 바꾼다
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("====================================");

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        // 1에서만 바꾸었는데 2를 확인해보니 2도 바뀌어있다.
        // 값이 복사된 게 아니고, 주소가 복사된 것!
        // => '얉은 복사'
        // 요소가 복사되서 객체가 하나씩 더 생긴게 아니고, 같은 객체를 가르키는 주솟값이 복사되어 넣어진 것!


        // < 깊은 복사 >
        System.out.println("/////////////// < 깊은 복사 > ////////////////");
        bookArray3[0] = new Book();
        bookArray3[1] = new Book();
        bookArray3[2] = new Book();

        for (int i = 0; i < bookArray3.length; i++) {
            bookArray3[i].setBookName(bookArray1[i].getBookName());
            bookArray3[i].setAuthor(bookArray1[i].getAuthor());
        }

        bookArray1[0].setBookName("어린왕자");
        bookArray1[0].setAuthor("생텍쥐페리");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("====================================");

        for (int i = 0; i < bookArray3.length; i++) {
            bookArray3[i].showBookInfo();
        }
        // => '깊은 복사'
        // 서로 다른 인스턴스의 메모리를 요소로 가지게 됨
    }
}
