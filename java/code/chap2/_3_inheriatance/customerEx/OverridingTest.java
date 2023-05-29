package core.code.chap2._3_inheriatance.customerEx;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(100100, "lee");
        customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer vipCustomerKim = new VIPCustomer(100101, "kim", 100);
        vipCustomerKim.calcPrice(10000);
        System.out.println(vipCustomerKim.showCustomerInfo());

        Customer customWho = new VIPCustomer(100102, "who", 200);
        int price = customWho.calcPrice(10000);
        System.out.println(customWho.showCustomerInfo());

        Customer cutomerGold = new GoldCustomer();
        cutomerGold.setCustomerName("test");
        cutomerGold.setCustomerId(111);
        cutomerGold.calcPrice(10000);
        System.out.println(cutomerGold.showCustomerInfo());

    }
}
