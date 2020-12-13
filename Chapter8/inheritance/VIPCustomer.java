package Chapter8.inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); // parent 를 부르는 예약어
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String) Call Constructor");
    }

    public int getAgentID() {
        return agentID;
    }

    // @Override // method overriding 오버라이딩을 하기위해서는반환형, 
    // 메서드 이름,매게변숙 개수,매개변수 자료형이 반드시 같아야한다.
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " : " + customerGrade + " bonus point is " + bonusPoint;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다";
    }

}
