package core.code.chap2._1_class_instance.singleton;

public class Company {

    private static Company instance = new Company(); // 전체에서 유일하게 사용될 인스턴스
    // 외부에서 함부로 호출하지 못하게 private (null이 되거나 값이 바뀌면 안되니까)
    // 유일하게 하나만 있을거니까 static


    private Company() {
    } // default constructor를 직접 만들어야한다. 그래야 인스턴스가 새롭게 여러개 안만들어지지.
    // 직접 private 으로 지정하지않으면 pre-compile단계에서 생성됨
    // 외부에서 함부로 호출하지 못하게


    // 이제 가져다 쓸수있는 메소드 하나 생성
    public static Company getInstance() {
        if(instance == null){
            instance = new Company(); // 방어코드 : 만약 instance가 null 이면 새로 생성해서 만들어주기
        }
        return instance;
        //객체를 생성하지 않고 이 메소드를 부를 수 있는 방법 -> 'static' 사용하기
    }
}
