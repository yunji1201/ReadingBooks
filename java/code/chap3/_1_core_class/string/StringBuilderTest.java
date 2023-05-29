package core.code.chap3._1_core_class.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String st1 = new String("java");
        System.out.println(System.identityHashCode(st1)); // 1308927845

        StringBuilder sb = new StringBuilder(new String(st1));
        System.out.println(System.identityHashCode(sb)); //2017354584

        sb.append(" and");
        sb.append(" andtoid");
        System.out.println(System.identityHashCode(sb)); // 2017354584

        String st2 = sb.toString();
        System.out.println(st2); // java and andtoid
    }
}
