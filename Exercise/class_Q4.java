package Exercise;

public class class_Q4 {
    public static void main(String[] args) {
    MyDog dog = new MyDog("멍멍", "진돗개");
    System.out.println(dog);
    }
}
class MyDog{
    String name;
    String type;
    MyDog(String name,String type){
        this.name = name;
        this.type = type;

    }
    public String toString(){ // 기본으로 할때에도 toString으로 할때에도 동일하다.--> toString이 기본적으로 사용됨
        return name +" "+type; // 그래서 toString을 재정의 해서사용함으로써 print 가능
    }

}