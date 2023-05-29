package core.code.chap2._5_3_buy;

public interface Buy {
    void buy();

    default void order() { // 구현체가 있으니까
        System.out.println("구매주문");
    }
}
