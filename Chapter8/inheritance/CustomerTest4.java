package Chapter8.inheritance;

public class CustomerTest4 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10010, "Lee");
       // customer1.bonusPoint = 1000;

        System.out.println(customer1.showCustomerInfo());

        Customer customer2 = new VIPCustomer(10020, "Kim", 12345);
        //customer2.bonusPoint = 1000;

        System.out.println(customer2.showCustomerInfo());
        System.out.println("====== 할인률 보너스 포인트 계산=====");

        int price = 10000;
        int pricecu1 = customer1.calcPrice(price);
        int pricecu2 = customer2.calcPrice(price);

        System.out.println(customer1.getCustomerName() + "님이 "+ pricecu1+ "지불 하셧습니다.");
        System.out.println(customer1.showCustomerInfo());
        System.out.println(customer2.getCustomerName() + "님이 "+ pricecu2+ "지불 하셧습니다.");
        System.out.println(customer2.showCustomerInfo());
    }
}
