package core.code.chap3._5_io.serialization;

import java.io.*;

class Person implements Serializable {

    //    private static final long
    String name;
    String title;

    public Person() {
    }

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String toString() {
        return name + " : " + title;
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person personLee = new Person("Lee", "Manager");
        try (FileOutputStream fos = new FileOutputStream("src/main/java/core/code/chap3/serialization/serial.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("src/main/java/core/code/chap3/serialization/serial.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object obj = ois.readObject();
            if (obj instanceof Person) {
                Person p = (Person) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

//java.io.NotSerializableException: core.code.chap3._5_io.serialization.Person 처음에는 에러발생 => 객체의 정보가 외부로 유출
// implements Serializable을 하게되면 허용하게된다.