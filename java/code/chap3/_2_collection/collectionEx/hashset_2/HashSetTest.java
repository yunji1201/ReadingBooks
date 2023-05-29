package core.code.chap3._2_collection.collectionEx.hashset_2;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set); // [aaa, ccc, bbb]

        set.add("aaa");
        System.out.println(set); // [aaa, ccc, bbb] => 중복 허용 안된다

        boolean b1 = set.add("ddd");
        System.out.println(b1); // true
        boolean b2 = set.add("ddd");
        System.out.println(b2); // false (같은 엘리먼트라서 안 들어갔다)
    }
}
