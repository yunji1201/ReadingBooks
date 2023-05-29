package core.code.chap2._4_3_template2;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빠르게 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다");
    }

    @Override
    public void turn() {
        System.out.println("turn 못해요");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" *** 중급자레벨입니다 *** ");
    }
}
