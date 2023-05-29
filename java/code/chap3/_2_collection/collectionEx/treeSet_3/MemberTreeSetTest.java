package core.code.chap3._2_collection.collectionEx.treeSet_3;

import core.code.chap3._2_collection.collectionEx.Member;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet memberHashSet = new MemberTreeSet();

        Member memberLee = new Member(103, "김다윤");
        Member memberKim = new Member(102, "김윤지");
        Member memberJeon = new Member(101, "전율");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberJeon);

        memberHashSet.showAll();

        Member memberEun = new Member(101, "김은희");
        memberHashSet.addMember(memberEun);
        memberHashSet.showAll();

        // TreeSet을 할 때 멤버 아이디를 거꾸로 해보았다. 103-102-101이 되도록
        // ClassCastException 에러 발생 : Member cannot be cast to class java.lang.Comparable
        // 아이디를 어떻게 비교해서 넣을지 Member클래스에서 정의해주지 않아서 발생함
        // 즉, Comparable 할만한게 정의되어있지 않음!
    }
}
