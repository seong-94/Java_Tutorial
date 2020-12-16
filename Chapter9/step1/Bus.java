package Chapter9.step1;

public class Bus extends Car{

    public void takePassenger(){
        System.out.println("버스가 손님을 태웁니다.");
        
    }

    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
    
}
