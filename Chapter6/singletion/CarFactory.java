package Chapter6.singletion;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private CarFactory(){
        carNum++;
    }
    static int carNum = 10000;
    int carID;
    
    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }
    
   

    public int getCarNum(){
        return carNum;
    }
    public void createCar(){
        this.carID = carNum;
    }
}
