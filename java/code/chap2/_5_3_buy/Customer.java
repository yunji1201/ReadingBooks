package core.code.chap2._5_3_buy;

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("구매하기");
    }


    @Override
    public void sell() {
        System.out.println("판매하기");

    }

    @Override
    public void order() {
        System.out.println("고객 판매 주문");
        // default 메소드가 Buy, Sell 두개의 인스턴스에서 같은 이름으로 중복되어있다면
        // Customer에서 Overriding해서 사용한다
    }
}
