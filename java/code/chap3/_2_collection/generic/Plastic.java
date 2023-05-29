package core.code.chap3._2_collection.generic;

public class Plastic extends Material{
    @Override
    public String toString() {
        return "재료는 플라스틱입니다";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스틱 재료로 출력합니다");
    }
}
