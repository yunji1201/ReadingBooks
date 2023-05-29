package core.code.chap2._1_class_instance.thisEx;

class Person {
    String name;
    int age;

    public Person() { // 디폴트 값일때 호출하고 싶은 것 -> 디폴트 값 : 매개변수 없을 때
        this("이름없음", 1); // 이렇게 this를 쓰면 에러가 뜬다.
        // 즉, 생성자에서 다른 생성자를 호출하는 this()를 사용할 때 이 this는 가장 먼저 나오는 statement여야한다. 가장 먼저 나와야함
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person returnSelf() { // 자기자신 클래스 명으로 반환형을 지정한다
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.name);

        String p1This = String.valueOf(p1.returnSelf());

        System.out.println(p1This);
    }

}
