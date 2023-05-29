package core.code.chap3._1_core_class.classclass;

public class StringTest2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Person p = new Person();
        System.out.println(p);

        Class pClass = Class.forName("core.code.chap3._1_core_class.classclass.Person");
        Person p2 = (Person) pClass.newInstance(); // Object로 되어있으니까 다운캐스팅해주기
        // newInstance()메서드가 불리면, '디폴트 생성자'가 불린다.
        System.out.println(p2);
    }
}
