package core.code.chap3._5_io.InputStream;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class InputStream_0919 {

    public static void main(String[] args) {

        System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
        int i = 0;
        try {
            while ((i = System.in.read()) != '\n') {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("name : ");
        String name = scan.nextLine(); // 한줄을 읽는다
        System.out.print("number : ");
        int num = scan.nextInt();

        System.out.print(name + num);

        Console console = System.console();
        String name1 = console.readLine(); // 한줄을 읽는다


    }
}

//system.in은 한 바이트씩 읽어들이는 것