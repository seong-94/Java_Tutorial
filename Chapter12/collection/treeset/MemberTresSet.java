package Chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import Chapter12.collection.Member;

public class MemberTresSet {
    private TreeSet<Member> treeSet;
    public MemberTresSet(){
        treeSet = new TreeSet<Member>();
    }
    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = treeSet.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                treeSet.remove(member);
                return true;
            }
            
        }
        System.out.println(memberId + " 가 존재 하지 않습니다.");
        return false;
    }
    public void showAllMember(){
        for(Member m : treeSet){
            System.out.println(m);
        }
        System.out.println();
    }

}
