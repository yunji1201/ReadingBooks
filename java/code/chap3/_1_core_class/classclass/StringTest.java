package core.code.chap3._1_core_class.classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 클래스를 데리고 와서 그 클래스의 생성자, 필드, 메서드 꺼내보기

        Class strClass = Class.forName("java.lang.String");

        Constructor[] cons = strClass.getConstructors(); // 어떤 생성자들 있는지 확인하기

        for (Constructor c : cons) {
            System.out.println(c);
        }

        Field[] fields = strClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        Method[] methods = strClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
