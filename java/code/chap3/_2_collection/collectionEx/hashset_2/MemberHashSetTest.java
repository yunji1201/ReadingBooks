package core.code.chap3._2_collection.collectionEx.hashset_2;

import core.code.chap3._2_collection.collectionEx.Member;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(101, "김다윤");
        Member memberKim = new Member(102, "김윤지");
        Member memberJeon = new Member(103, "전율");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberJeon);

        memberHashSet.showAll();

        Member memberEun = new Member(101, "김은희");
        memberHashSet.addMember(memberEun);
        memberHashSet.showAll();
        // 아이디가 똑같이 101인데 추가가 된다. 지금 김다윤과 김은희는 같은 아이디로 넣어져있다.
        // 기존에 들어있는 애와, 새로 들어갈 애가 같은지를 확인해야한다.
        // Member에 가서 equals와 hashcode를 재정의 해야한다 (override) -> 아이디가 같을때 같도록 인식시키기!

        // 재정의하고 다시 테스트해보면 "김은희"는 안들어간 것을 알 수 있다.
    }
}
