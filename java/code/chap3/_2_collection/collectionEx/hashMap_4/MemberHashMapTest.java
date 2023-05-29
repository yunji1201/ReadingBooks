package core.code.chap3._2_collection.collectionEx.hashMap_4;

import core.code.chap3._2_collection.collectionEx.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(103, "김다윤");
        Member memberKim = new Member(102, "김윤지");
        Member memberJeon = new Member(101, "전율");

        memberHashMap.addMember(memberJeon);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberLee);

        memberHashMap.showAllMember();
        // HashMap이니까 순서는 중요하지않음.

        memberHashMap.removeMember(102);
        memberHashMap.showAllMember();
    }
}
