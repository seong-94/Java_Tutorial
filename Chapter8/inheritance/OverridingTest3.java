package Chapter8.inheritance;


public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;
        Customer customer1 =new Customer(10010, "Lee");
        System.out.println(customer1.getCustomerName() + " pay " + customer1.calcPrice(price));

        VIPCustomer customer2 = new VIPCustomer(100020, "Kim", 1234);
        System.out.println(customer2.getCustomerName() + " pay " + customer2.calcPrice(price));

        Customer vc = new VIPCustomer(10030,"none" , 2000);
        System.out.println(vc.getCustomerName() + " pay "+ vc.calcPrice(price));
    }
}
