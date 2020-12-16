package Chapter9.template;

public class ManualCar extends Car {



    @Override
    public void drive(){
        System.out.println("사람이 운전 ");
        System.out.println("사람이 방향전환합니다.");
        
    }
    public void wiper(){
        System.out.println("사람이 빠르기를 조절합니다.");

    }
    @Override
    public void stop(){
        System.out.println("브레이크로 정지합니다.");
    }
   
}
