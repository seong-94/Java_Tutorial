package Chapter9.GameLevel;

public abstract class PlayerLevel {
    public abstract void run();

    public abstract void jump();

    public abstract void trun();

    public abstract void showLevelMessage();

    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }

        trun();
    }

}
