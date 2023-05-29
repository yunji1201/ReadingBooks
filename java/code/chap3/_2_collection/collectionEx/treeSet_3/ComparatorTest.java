package core.code.chap3._2_collection.collectionEx.treeSet_3;

import java.util.Comparator;
import java.util.TreeSet;

// 비교하는 방식 만들기
class MyCompare implements Comparator<String> {

    @Override
    public int compare(String t1, String t2) {
        return t1.compareTo(t2) * (-1); // 내림차순으로 반환
    }
}

public class ComparatorTest {
    public static void main(String[] args) {

//        TreeSet<String> tree = new TreeSet<String>();     원래는 이건데
        TreeSet<String> tree = new TreeSet<String>(new MyCompare()); // 이렇게 가로안에 new MyCompare()을 적어서 사용하게 되면 내가 만든 비교방식으로 정렬된다 -> 내림차순으로!

        tree.add("aaa");
        tree.add("bbb");
        tree.add("ccc");
        
        System.out.println(tree);
    }

}
