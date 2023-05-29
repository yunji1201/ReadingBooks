package core.code.chap2._3_inheriatance.downCasting;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Eagle());
        test.moveAnimal(new Tiger());

        Animal[] animalList = new Animal[3];
        animalList[0] = new Human();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger());
    }

    public void moveAnimal(Animal animal) {
        animal.move(); // 이 코드 한줄이 결과적으로는 아래의 세가지 각기다른 결과값이 나온다 => '다형성'

        Human human = (Human) animal;
        human.readBook(); // 컴파일은 된다. 근데 여기서 런타임을 돌리면 에러가 떨어진다. 그래서 다운캐스팅 해야함

        //다운캐스팅
        if (animal instanceof Human) {  // 먼저 그 타입이 맞는지 확인을 해야한다
            Human human1 = (Human) animal;
            human1.readBook();
        } else { // 생뚱맞은 인스턴스가 들어왔을때
            System.out.println("지원되지 않는 기능입니다.");
        }
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

    public void readBook() {
        System.out.println("사람이 책을 읽습니다");
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