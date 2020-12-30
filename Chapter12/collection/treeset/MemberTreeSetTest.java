package Chapter12.collection.treeset;

import Chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTresSet memberTreeSet = new MemberTresSet();
        
        Member member1 = new Member(1001, "가");
        Member member2 = new Member(1002, "마");
        Member member3 = new Member(1003, "다");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.showAllMember();


        Member member4 = new Member(1004, "라");
        memberTreeSet.addMember(member4);
        memberTreeSet.showAllMember();

        
        
    }
}
