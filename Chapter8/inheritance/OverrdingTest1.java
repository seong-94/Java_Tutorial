package Chapter8.inheritance;

public class OverrdingTest1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10010, "Lee");
        customer1.bonusPoint = 1000;

        VIPCustomer customer2 = new VIPCustomer(10020, "kim", 12345);
        customer2.bonusPoint = 10000;
    
        int price = 10000;
        System.out.println(customer1.getCustomerName() + " pay " + customer1.calcPrice(price));
        System.out.println(customer2.getCustomerName() + " pay " + customer2.calcPrice(price));
 
    }

}
