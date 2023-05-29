package core.code.chap3._2_collection.collectionEx;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
    private int memberId;
    private String memberName;

    // default 생성자 만들기
    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + "회원님의 아이디는 '" + memberId + "'입니다";
    }

    @Override
    public int hashCode() {
        return memberId;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.memberId) {
                return true;
            } else return false;
        }
        return false;
    }

    // implements Comparable<Member> 했을 때 구현해야 할 메서드
    @Override
    public int compareTo(Member member) {
        // 나(this)와 넘어온 애(member)를 비교한다
        return (this.memberId - member.memberId); // 오름차순
//        (this.memberId - member.memberId) * (-1) // 내림차순
//        member.memberId - this.memberId // 내림차순
//        this.memberName.compareTo(member.memberName)) // 이름으로 오름차순
//        this.memberName.compareTo(member.memberName)) * (-1) // 이름으로 내림차순
    }

    // implements Comparator<Member> 했을 때 구현해야 할 메서드
    @Override
    public int compare(Member member, Member t1) {
        // member는 나
        // t1은 넘어온 애
        return (member.memberId - t1.memberId); // 오름차순

        // 이걸 진행하려면 MemberTreeSet에서 생성자에 new Member()를 추가해야한다.
        // 추가하면 에러가 뜨는데 그러면 Member class에 default 생성자가 없기때문이므로 추가해줘야 한다.
        // default 생성자 만들기 => ` public Member() { }`
    }
}
