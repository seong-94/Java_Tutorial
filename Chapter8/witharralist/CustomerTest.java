package Chapter8.witharralist;

import java.util.ArrayList;

import Chapter8.inheritance.Customer;
import Chapter8.inheritance.VIPCustomer;

public class CustomerTest {
    public static void main(String[] args) {
        
        ArrayList<Customer> customerlist = new ArrayList<Customer>();

        customerlist.add(new VIPCustomer(10010,"Lee",1234));
        customerlist.add(new GoldCustomer(10010,"Lee2"));
        customerlist.add(new GoldCustomer(10010,"Lee3"));
        customerlist.add(new Customer(10010,"Lee4"));
        customerlist.add(new Customer(10010,"Lee5"));
        

        int price = 10000;

        for(Customer C : customerlist){// enhanced for Loop
            System.out.println(C.getCustomerName() + " pay " + C.calcPrice(price) );
            System.out.println(C.showCustomerInfo());
        }
       
       

    }
}
