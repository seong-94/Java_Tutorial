package Chapter8.inheritance;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(){
        initCustomer(); // 고객 등급과 보너스 포인트 적립률 지정 함수 호출
    }
    public Customer (int customerID,String customerName)
    {   
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade  = "SILVER"; // basic grade
        bonusRatio = 0.01;
        initCustomer(); // 고객 등급과 보너스 포인트 적립률 지정 함수 호출
       // System.out.println("Customer(int,String) Call Constructor");
    }
    private void initCustomer(){ // 멤버 변수의 초기화 부분
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public int calcPrice(int price) {
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
