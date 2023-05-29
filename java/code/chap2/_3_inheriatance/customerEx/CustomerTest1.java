package core.code.chap2._3_inheriatance.customerEx;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerId(961201);
        customerLee.setCustomerName("Lee");

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerId(961201);
        customerKim.setCustomerName("Kim");

        customerKim.bonusPoint = 1000;
        // 만약에 bonusPoint가 protected, default가 아니고 private 이라면 메모리과정에서 메로리가 생성되기는 하지만 그냥 안보이는 것임, 접근 안되는 것 뿐.

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

        Customer customer = new VIPCustomer(101, "EffectiveJava.ch3.test", 101);
        // 타입은 Customer인데, 생성은 VIPCustomer이다
        // 생성자체가 VIPCustomer라서 메모리는 Customer꺼 + VIPCustomer꺼 다 같이 생성되어있다
        // 그렇지만 이렇게 사용하게되면 vip쪽에 있는 메소드, 변수들을 사용할 수 없음
        // cusotmer.userAgnet이런걸 사용 못함!!

    }
    // !!! 하위 클래스가 호출되면 상위클래스가 먼저 호출된다
}
