package Exercise;

public abstract class chapter_9_Q5_Car {
    
    
    abstract void start();
    abstract void drive();
    abstract void stop();
    abstract void trunOff();

    
    public void run(){
        start();
        drive();
        stop();
        trunOff();
      
    }
}
