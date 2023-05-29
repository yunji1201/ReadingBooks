package core.code.chap2._4_3_template2;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("jump 못해요");
    }

    @Override
    public void turn() {
        System.out.println("turn 못해요");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" *** 초보자레벨입니다 *** ");
    }
}
