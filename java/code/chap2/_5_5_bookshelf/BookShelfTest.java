package core.code.chap2._5_5_bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("태백산맥1");
        shelfQueue.enQueue("태백산맥2");
        shelfQueue.enQueue("태백산맥3"); // 책 넣기

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
