package core.code.chap3._1_core_class.object;

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("테스트");
        String str2 = new String("테스트");

        // equals() 메서드 예시
        System.out.println(str1 == str2); // 메모리 주솟값 같은지 확인 => false
        System.out.println(str1.equals(str2)); // 문자열이 같은지 확인 => true - 논리적인 동일성을 판단할 때 사용한다.

        // Student 클래스로 비교하기
        Student s1 = new Student(123, "yunji");
        Student s2 = new Student(123, "yul");

        System.out.println(s1 == s2);//  => false
        System.out.println(s1.equals(s2)); // => false   < 재정의하기전>
        System.out.println(s1.equals(s2)); // => true   < 재정의 한후> - stuId 가 같을때는 같은 학생으로 인식하도록!

        // hashCode() 메서드 예시
        System.out.println(s1.hashCode()); // 2017354584 - 10진수 반환! 위치주솟값임
        System.out.println(s2.hashCode()); // 391447681 (다르다)
        System.out.println(str1.hashCode()); // 53088992
        System.out.println(str2.hashCode()); // 53088992 (같다) => 해시코드값이 같은 이유는 hashCode()가 재정의 되어있기 때문!
        System.out.println(System.identityHashCode(str1)); // 1935637221 ->  이건 완전 실제 jvm 메모리 안의 hashcode를 보는 것!
        System.out.println(System.identityHashCode(str2)); // 403424356 (다르다)

    }
}

class Student {
    int stuId;
    String name;

    public Student(int stuId, String name) {
        this.stuId = stuId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) { // Object로 변환되니까 그걸 다시 다운캐스팅
//        return super.equals(obj); => equals 메서드의 원형
        if (obj instanceof Student) {
            // 들어온 obj가 Student인지 확인해야지 아니면  false 내보내고
            Student std = (Student) obj;
            if (stuId == std.stuId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        // 뭐를 반환하면 값이 가장 적절할까?
        // equals() 재정의에서 사용한 멤버변수를 사용하라!
        return stuId; // 두 학생이 같을때 같은 stuId를 반환하게 되는 것이니까
    }
}