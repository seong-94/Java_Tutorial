package Chapter11.object;

public class objectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle)); // 주소값에서 알수 있듯이 새로운 주소에 생성하여 copy 한다.
    }

}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "X = " + x + "," + "y = " + y;
    }

}

class Circle implements Cloneable {
    Point point;
    int radius;

    Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);

    }

    public String toString() {
        return "원점은 " + point + "이고 반지름은 " + radius + " 입니다.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {// clone 메서드를 사용할때 발생할수 있는 오류를 예외 처리함.
        return super.clone();
    }
}
