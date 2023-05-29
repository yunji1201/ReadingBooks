package core.code.chap2._5_5_bookshelf;

public interface Queue {
    void enQueue(String title);

    String deQueue();

    int getSize();
}
