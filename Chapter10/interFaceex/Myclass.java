package Chapter10.interFaceex;

public class Myclass implements  MyInterFace {
    @Override
    public void x() {
        System.out.println("from X()");
    }
    @Override
    public void y() {
        System.out.println("from Y()");
    }

    @Override
    public void myMethod() {
        System.out.println("from myMethod()");
    }
    
}
