package Chapter9.GameLevel;

public class advanced extends PlayerLevel {
    
    @Override
    public void run() {
        
        System.out.println("빨리 달립니다.");
    }
    @Override
    public void jump() {
        System.out.println("높이 점프합니다.");
    }
    @Override
    public void trun() {
        System.out.println("trun 할줄 모름");
    }
    @Override
    public void showLevelMessage() {
        System.out.println("advanced level");
    }

}
