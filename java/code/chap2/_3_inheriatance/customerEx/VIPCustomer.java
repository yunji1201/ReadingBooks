package core.code.chap2._3_inheriatance.customerEx;

public class VIPCustomer extends Customer { // 상위클래스(Customer)의 기능을 내가 모두 가져다 쓰겠다!

    private double saleRatio;
    private int agentId;

    public VIPCustomer() {
        // super(); // 상위클래스의 디폴트생성자 호출 // 프리컴파일단계에서 자동적으로 생성된다
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 호출");
    }

    // 위 생성자랑 같은 의미
    public VIPCustomer(int customerId, String customerName, int agentId) {
        // 그런데 상위클래스에서 default생성자가 없을 때, 즉 매개변수가 있는 다른 생성자를 사용하므로써 defualt생성자를 프리컴파일단계에서 넣어주지 않으면
        // 이렇게 super키워드를 명시적으로 작성해줘야함
        super(customerId, customerName);

        customerGrade = "VIP"; // 이런 값들은 오버라이딩된다
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentId = agentId;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public int getAgetnId() {
        return agentId;
    }
}
