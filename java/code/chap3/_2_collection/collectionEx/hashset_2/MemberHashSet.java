package core.code.chap3._2_collection.collectionEx.hashset_2;

import core.code.chap3._2_collection.collectionEx.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMmeber(int memberId) {

        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAll() {

        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }
        System.out.println(hashSet);
    }
}
