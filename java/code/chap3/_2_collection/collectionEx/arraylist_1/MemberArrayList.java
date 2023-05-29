package core.code.chap3._2_collection.collectionEx.arraylist_1;

import core.code.chap3._2_collection.collectionEx.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    // 생성자
    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    // 추가하기
    public void addMember(Member member) {
        arrayList.add(member);
    }

    // 삭제하는거 (우선 가져온 아이디를 for문 돌려서 id가 같은걸 찾아내고 있으면 삭제-)
    public boolean removeMmeber(int memberId) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            int tempId = member.getMemberId();
//            if (memberId == tempId) {
//                arrayList.remove(i);
//                return true;
//            }
//        }

        // < Iteraotr를 사용하는 방법 >
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next(); // Member라고 제너릭타입으로 정해줬으니까 Member로 따로 형변환 안해도 된다
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    // 다 쭉 보여주는거
    public void showAll() {

        // list로 해보기
//        for (Member member : arrayList) {
//            System.out.println(member);
//        }

        // Iterator로 해보기
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }
        System.out.println(arrayList);
    }
}