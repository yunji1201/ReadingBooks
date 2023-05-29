package core.code.chap2._3_inheriatance.withArraylist;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    // 보통 private을 쓰는데 외부클래스에서 안보이고 "상속관계"에서는 보이게 하는게 protected 이다.
    // 패키지가 달라도 사용할 수 있다. 상속관계에서는 "public"이랑 같음
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        // 뭐가 언제 생성되는지 알아보기
        System.out.println("customer() 호출");
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;


    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "/" + customerGrade + "/" + bonusPoint;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }


}
