package core.code.chap3._2_collection.collectionEx.arraylist_1;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        // data가 없는데 꺼내려고하면 underflow error가 발생한다. = 언더플로우는 범위 중 최소값을 뛰어 보다 더 아래 값을 표현하려고 하는 경우에 발생
        // 그러므로 방어코드 만들기
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.remove(len - 1);
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        System.out.println(myStack.pop()); // c
        System.out.println(myStack.pop()); // b
        System.out.println(myStack.pop()); // a

        System.out.println(myStack.pop()); // null
    }
}
