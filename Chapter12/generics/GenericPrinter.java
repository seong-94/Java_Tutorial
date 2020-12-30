package Chapter12.generics;

public class GenericPrinter<T extends Material> { //제네릭 클래스 T 는 type 의 약자 자료형 매개 변수 // extends 예약어로 사용할수 있는 자료형에 제한을 둠
    private T material; // T 자료형으로 선언한 변수 

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing(){
        material.doPrinting();
    }
}
