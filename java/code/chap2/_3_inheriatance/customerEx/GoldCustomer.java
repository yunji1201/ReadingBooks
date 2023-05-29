package core.code.chap2._3_inheriatance.customerEx;

public class GoldCustomer extends Customer { // 상위클래스(Customer)의 기능을 내가 모두 가져다 쓰겠다!

    public GoldCustomer() {
        bonusRatio = 0.05;
    }

    @Override // 컴파일러에게 이친구가 어떤 역할을 하는지 알려주는 역할
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
