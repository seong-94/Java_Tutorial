package Chapter10.interFaceex;

public class MClassTest {
    
    public static void main(String[] args) {
        Myclass mClass = new Myclass();
        X xclass = mClass;
        xclass.x();

        Y yClass = mClass;
        yClass.y();


        MyInterFace iClass = mClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }

}
