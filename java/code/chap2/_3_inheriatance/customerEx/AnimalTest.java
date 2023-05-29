package core.code.chap2._3_inheriatance.customerEx;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Eagle());
        test.moveAnimal(new Tiger());
    }

    public void moveAnimal(Animal animal) {
        animal.move(); // 이 코드 한줄이 결과적으로는 아래의 세가지 각기다른 결과값이 나온다 => '다형성'
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 움직입니다");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발 걷기");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘날기");
    }
}