package core.code.chap2._5_3_buy;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        Sell seller = customer;
        seller.sell();

        customer.order();
        buyer.order();
        seller.order();
        // 셋다 "고객 판매 주문"이 보인다.
        // 왜냐하면 buy, sell 모두 customer와 바인딩되어있기때문에
        // customer의 order가 불리게 된다
    }
}
