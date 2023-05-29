package core.code.chap2._2_1_array;

public class Array {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }

        for (int i = 0; i < alphabets.length; i++, ch++) {
            System.out.println(alphabets[i]);
        }
    }
}
