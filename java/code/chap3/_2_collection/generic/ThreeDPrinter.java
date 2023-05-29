package core.code.chap3._2_collection.generic;

public class ThreeDPrinter<T extends Material> { // Material을 상속받은 애들만 들어갈 수 있다.

    private T material;
    // 모든 클래스는 Object를 통해 형변환된다

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
