package Chapter9.GameLevel;

public class beginner extends PlayerLevel {
    @Override
    public void run() {
        System.err.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println(" jump 할줄 모름.");
    }
    @Override
    public void trun(){
        System.out.println("trun 할줄 모름");
    }
    @Override
    public void showLevelMessage() {
        System.out.println("beginner level");
    }
}
