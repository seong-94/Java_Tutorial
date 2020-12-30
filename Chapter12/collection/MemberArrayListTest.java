package Chapter12.collection;

public class MemberArrayListTest {

    public static void main(String[] args) {
        
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001, "1");
        Member member2 = new Member(1002, "2");
        Member member3 = new Member(1003, "3");
        Member member4 = new Member(1004, "4");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);

        memberArrayList.insertMember(member4, 2); // String 을 직접 입력하지 못하고 인스턴스 를 만든후에가능 
        memberArrayList.showAllMember();

        memberArrayList.removeMember(member1.getMemberId());
        memberArrayList.showAllMember();
    }
    
}
