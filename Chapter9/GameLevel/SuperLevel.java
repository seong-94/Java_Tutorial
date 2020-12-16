package Chapter9.GameLevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("매우 빨리 달립니다.");
    }
    @Override
    public void jump() {
        System.out.println(" jump 높이 모름.");
    }
    
    @Override
    public void trun() {
        System.out.println("한바퀴 돕니다.");
    }
    @Override
    public void showLevelMessage() {
        System.out.println("Super Level");
    }
    
}
