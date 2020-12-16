package Chapter8.inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030 , "Lee", 2000);
        vc.bonusPoint =1000;


        
        System.out.println(vc.getCustomerName() + " pay " + vc.calcPrice(10000));
    }
}
