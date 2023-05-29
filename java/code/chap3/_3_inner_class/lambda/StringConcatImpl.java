package core.code.chap3._3_inner_class.lambda;

public class StringConcatImpl implements StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
}
