package Chapter12.collection;

import java.util.ArrayList;
import java.util.Iterator;

import Chapter12.collection.Member;


public class MemberArrayList {
    private ArrayList<Member> arrayList; // declear ArrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();// Member 형으로 선언한 ArrayList 생성

    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    // public boolean removeMember(int memberId) {
    //     for (int i = 0; i < arrayList.size(); i++) {
    //         Member member = arrayList.get(i);
    //         int tempId = member.getMemberId();
    //         if (tempId == memberId) {
    //         arrayList.remove(i);
    //         return true;
    //         }
    //     }
    //     System.out.println(memberId + " 가 존재 하지 않습니다.");
    //     return false;
    // }

    public boolean removeMember(int memberId) { // Iterator 
        Iterator<Member> ir = arrayList.iterator();//Iterator 반환
        while(ir.hasNext()){                       //요소가 있는동안
            Member member = ir.next();             //다음 멤버를 반환 받음
            int tempId = member.getMemberId();     
            if(tempId == memberId){                //회원 아이디가 매개변수와 일치하면 
                arrayList.remove(member);          // 해당 회원 삭제
                return true;                       // true 반환
            }
        }
        System.out.println(memberId + " 가 존재 하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member m : arrayList){
            System.out.println(m);
        }
        System.out.println();
    }
    public void insertMember(Member member,int index){
        if(index < 0 || index > arrayList.size() +1 ){
            System.out.println("out of the arraysize");
            return ;
        }
        arrayList.add(index-1, member);
        
    }

}
