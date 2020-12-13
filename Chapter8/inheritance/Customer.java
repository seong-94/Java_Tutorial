package Chapter8.inheritance;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer (int customerID,String customerName)
    {   
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade  = "SILVER"; // basic grade
        bonusRatio = 0.01;
        System.out.println("Customer(int,String) Call Constructor");
    }
    
    public int clacPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    
    public int getCustomerID(){
        return customerID;
    }
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    
    public String getCustomerGrade(){
        return customerGrade;
    }
    public void setCustomerGrade(String customerGrade){
        this.customerGrade = customerGrade;
    }


    public String showCustomerInfo(){
        return customerName + " : " + customerGrade + " bonuspoint is : " +bonusPoint;

    }
}
