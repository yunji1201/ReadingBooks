package core.code.chap2._2_2_arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList list2 = new ArrayList<>(); // object 타입, 제네릭 타입
        list.add("안녕");
        list.add("나는");
        list.add("윤지");

        list2.add("이건");
        list2.add("테스트");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String s = list.get(i);
            System.out.println(s);
            // index개념은 arrayList에서 못쓰고 오직 list배열에서만 사용 가능.
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }


    }
}
