package core.code.chap3._2_collection.collectionEx.treeMap_5;

import core.code.chap3._2_collection.collectionEx.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberDa = new Member(103, "김다윤");
        Member memberKim = new Member(102, "김윤지");
        Member memberJeon = new Member(101, "전율");

        memberTreeMap.addMember(memberJeon);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberDa);

        memberTreeMap.showAllMember();
        // treeMap이라서 정렬이 자동으로 된다.
        // Tree가 <Integer, Member>로 되어있는데 Integer에 들어가보면 이미 comparable이 구현되어있다. 그러므로 아이디 값을 서로 비교해서 정렬이 될 수 있다.

    }
}
