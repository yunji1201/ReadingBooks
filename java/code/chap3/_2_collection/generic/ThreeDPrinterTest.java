package core.code.chap3._2_collection.generic;

public class ThreeDPrinterTest {
    public static void main(String[] args) {

        // Object 사용할 시
        ThreeDPrinter2 printer = new ThreeDPrinter2();
        printer.setMaterial(new Powder()); // 프린터에서 set을 Object로 받고 있음
        Powder powder = (Powder) printer.getMaterial(); // 받고 있는게 Object니까 Powder 선언하는거니까 '다운캐스팅' 해야한다!

        // 제네릭 사용할 시
        ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
        printer1.setMaterial(new Powder());
        Powder powder1 = printer1.getMaterial(); // 제네릭은 다운캐스팅 필요없음
        // 제네릭 내부 로직 설명
        // 1) T가 모두 Object로 변환된다
        // 2) 컴파일러가 모두 캐스팅작업을 해준다.

        System.out.println(printer);
        System.out.println(printer1);

        ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
        printer2.setMaterial(new Plastic());
        Plastic plastic = printer2.getMaterial();
        System.out.println(printer2);

//        ThreeDPrinter<Water> printer3 = new ThreeDPrinter<>(); // 에러가 나온다 => Water는 Material을 상속받지 않았기 때문!
//        printer3.setMaterial(new Water());
//        Water water = printer3.getMaterial();
//        System.out.println(printer3);

        printer2.printing(); // 플라스틱 재료로 출력합니다
    }
}
