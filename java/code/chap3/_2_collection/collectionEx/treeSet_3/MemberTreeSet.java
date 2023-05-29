package core.code.chap3._2_collection.collectionEx.treeSet_3;

import core.code.chap3._2_collection.collectionEx.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>(new Member()); // 여기에서 new Member()를 빼면 comparator말고 기본적인 compare를 사용하게 된다
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMmeber(int memberId) {

        Iterator<Member> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAll() {

        Iterator<Member> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }
        System.out.println(treeSet);
    }
}
