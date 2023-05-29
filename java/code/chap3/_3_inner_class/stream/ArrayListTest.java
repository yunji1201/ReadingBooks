package core.code.chap3._3_inner_class.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        // ArrayList<String> sList 랑 List<String> 이렇게 쓰는거 모두 된다.
        // 왜냐면 List는 arrayList의 상위 인터페이스라서 !
        sList.add("yunji");
        sList.add("yul");
        sList.add("eunhee");

        // sList에 대한 스트림 생성하기!
        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s)); // 그 안에서는 람다식쓰기
        // forEach() : 하나씩 도는 최종연산자자

        System.out.println("-------------------------");
        sList.stream().sorted().forEach(s -> System.out.println(s));

    }
}
