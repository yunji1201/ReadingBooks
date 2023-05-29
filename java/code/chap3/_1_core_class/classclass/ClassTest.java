package core.code.chap3._1_core_class.classclass;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String str = new String("abc");
//        str. // 을 하면 그 안에 있는 내장함수들이 모두 나온다.
//        로컬에 없는 객체, 자료형을 가져다 쓰는 것 <리플렉션 프로그램> - 클래스의 정보를 알아와서 하는 프로그램 - 그럴떄 사용된다. Class 클래스


        // Class 클래스를 부를 수 있는 방법 3가지
        Person person = new Person();

        // (1) 이미 person처럼 인스턴스가 있으면 거기에서 .getClass()를 부를 수 있다
        Class pClass = person.getClass();
        System.out.println(pClass.getName()); // core.code.chap3._1_core_class.classclass.Person (패키지 + 이름)

        // (2)
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName()); // core.code.chap3._1_core_class.classclass.Person (패키지 + 이름)

        // (3)
        Class pClass3 = Class.forName("core.code.chap3._1_core_class.classclass.Person"); // core.code.chap3._1_core_class.classclass.Person (패키지 + 이름)


        // 여기서 (1), (2)은 Person이라는 클래스를 컴파일 해야지만 사용할 수 있는 방법
        // (3)은 문자열 자체를 직접 적어서 컴파일하기전에도 사용가능. 그 이름자체의 클래스를 찾아서 바로 메모리에 로딩한다.
    }
}
