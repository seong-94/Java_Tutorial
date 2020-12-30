package Chapter12.map.treemap;

import Chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberHashMap = new MemberTreeMap();

        Member member1 = new Member(1001, "1");
        Member member2 = new Member(1002, "2");
        Member member3 = new Member(1003, "3");
        Member member4 = new Member(1004, "4");


        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member4);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1003);
        memberHashMap.showAllMember();

    }
}
