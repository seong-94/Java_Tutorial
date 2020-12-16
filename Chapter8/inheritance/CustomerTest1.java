package Chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
       // Customer customer1 = new Customer();
        //customer1.setCustomerID(10010);
        //customer1.setCustomerName("Lee");
        //customer1.bonusPoint = 1000;
        //System.out.println(customer1.showCustomerInfo());

        System.out.println();

        VIPCustomer customer2 = new VIPCustomer(100020, "Kim",1000);
       //customer2.setCustomerID(10020);
        //customer2.setCustomerName("Kim");
        customer2.bonusPoint = 10000;
        System.out.println(customer2.showCustomerInfo());

        Customer vs = new VIPCustomer(10030, "YU", 100);
        System.out.print(vs.showCustomerInfo());

    
    }
}
