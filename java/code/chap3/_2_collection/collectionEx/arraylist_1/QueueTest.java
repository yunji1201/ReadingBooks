package core.code.chap3._2_collection.collectionEx.arraylist_1;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() { // 꺼내면 배열에서 사라져야지 -> remove
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return arrayQueue.remove(0);
    }

    public String peek() { // 그냥 맨위에 있는 값을 보여주는거 -> get
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return arrayQueue.get(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue("a");
        myQueue.enQueue("b");
        myQueue.enQueue("c");
        System.out.println(myQueue.peek()); // a

        System.out.println(myQueue.deQueue()); // a
        System.out.println(myQueue.deQueue()); // b
        System.out.println(myQueue.deQueue()); // c

        System.out.println(myQueue.deQueue()); // null
    }
}
