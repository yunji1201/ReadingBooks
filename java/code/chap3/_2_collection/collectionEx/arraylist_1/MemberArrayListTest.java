package core.code.chap3._2_collection.collectionEx.arraylist_1;

import core.code.chap3._2_collection.collectionEx.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList manager = new MemberArrayList();
        Member memberLee = new Member(101, "이씨");
        Member memberKim = new Member(102, "김윤지");
        Member memberJeon = new Member(103, "전율");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberJeon);

        manager.showAll(); // Vector 가 리스트 자체로 보여진다.
        // [이순신회원님의 아이디는 '101'입니다, 김윤지회원님의 아이디는 '102'입니다, 전율회원님의 아이디는 '103'입니다]

        manager.removeMmeber(memberLee.getMemberId()); // 삭제해보기
        manager.showAll();
        // [김윤지회원님의 아이디는 '102'입니다, 전율회원님의 아이디는 '103'입니다]
    }
}
