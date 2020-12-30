package Chapter12.hashset;

import java.util.HashSet;
import java.util.Iterator;
import Chapter12.collection.Member;

public class MemberHashSet {
    private HashSet<Member> hashSet; // hashSet 선언

    public MemberHashSet(){
        hashSet = new HashSet<>();

    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + " 가 존재 하지 않습니다.");
        return false;
    }
    public void showAllMember(){
        for(Member m: hashSet){
            System.out.println(m);
        }
        System.out.println();
    }

}
