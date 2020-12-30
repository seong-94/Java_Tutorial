package Chapter12.hashset;
import Chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1011, "1");
        Member member2 = new Member(1012, "2");
        Member member3 = new Member(1013, "3");
        Member member4 = new Member(1014, "4");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.addMember(member4);

        memberHashSet.showAllMember();

        Member member5 = new Member(1003,"5"); // ID 중복회원 추가 
        memberHashSet.addMember(member5);
        memberHashSet.showAllMember();

    }
}
