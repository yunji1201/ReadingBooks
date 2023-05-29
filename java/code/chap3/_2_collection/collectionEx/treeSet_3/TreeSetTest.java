package core.code.chap3._2_collection.collectionEx.treeSet_3;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("aaa");
        tree.add("bbb");
        tree.add("ccc");

        // 컬렉션 프레임워크들은 모두 이미 toString()이 구현이 되어있다.
        System.out.println(tree); // [aaa, bbb, ccc] - 이렇게 정렬되어서 배열로 나온다 -> 이유는 String쪽 눌러보면 이미 Comparable이 구현되어있다.
        // 즉 String 이런애들은 이미 그 안에서 comparable이 구현되어있는데 우리가 지금 사용하려는 타입인 Member에는 comparable같은게 구현되어있지 않으니까 에러가 나는거다.
        // Member안에도 만들어줘야한다.
        // => implements Comparable<Member> 하면 된다.
    }
}