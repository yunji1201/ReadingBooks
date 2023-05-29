package core.code.chap3._2_collection.generic;

public class Powder extends Material {
    @Override
    public String toString() {
        return "재료는 파우더입니다";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더 재료로 출력합니다");
    }
}
