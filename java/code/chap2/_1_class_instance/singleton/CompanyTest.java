package core.code.chap2._1_class_instance.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        // 일반적으로 이렇게 여러개의 객체를 만들면 인스턴스 다 달라
//        Company company = new Company();
//        Company company2 = new Company();

        // 싱글톤 패턴 사용하여 여러개의 객체 만들기
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        // 같은 인스턴스를 같게된다 => 싱글톤 패턴

        Calendar cal = Calendar.getInstance();
        // 자바 util의 싱글톤패턴 사용된 예제 : Calendar
        // 생성자 없어서 저렇게 사용해야함
        // 시간은 다 똑같으니까.


        // 예제문제
        // com1과 com2는 같고 com3는 에러가 나는 Company 코드를 만들어라 => '싱글톤패턴'
        Company com1 = Company.getInstance();
        Company com2 = Company.getInstance();
//        Company com3 = new Company();
        System.out.println(com1 == com2);
    }
}
