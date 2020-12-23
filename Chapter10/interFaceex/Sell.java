package Chapter10.interFaceex;

public  interface Sell {
    void sell();
    default void order(){
        System.out.println(" 판매 주문 ");
    }
}
