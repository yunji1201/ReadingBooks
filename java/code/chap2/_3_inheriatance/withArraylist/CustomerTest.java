package core.code.chap2._3_inheriatance.withArraylist;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        // customer 타입으로 하게되면 customer에서 상속되는 모든 종류의 객체가 들어갈 수 있다.

        Customer customer1 = new Customer(10010, "김씨");
        Customer customer2 = new Customer(10011, "이씨");
        Customer customer3 = new GoldCustomer(10012, "박씨");
        Customer customer4 = new GoldCustomer(10013, "최씨");
        Customer customer5 = new VIPCustomer(10014, "강씨", 12345);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        System.out.println("///////////////// 고객정보출력 ///////////////");
        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("///////////////// 할인율과 보너스포인트결과 ///////////////");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.showCustomerInfo());
            System.out.println(customer.getCustomerName() + " 님이" + cost + "를 지불하였습니다.");

            // 이런게 다형성!
            // 상속은 언제 사용할지 잘 판단해야한다.
            // 상속은 사용하게되면 종속되고 클래스간의 관계가 너무 타이트해진다. 그렇지만 잘 사용하면 아주 효율적으로 사용할 수 있다.

        }
    }
}
