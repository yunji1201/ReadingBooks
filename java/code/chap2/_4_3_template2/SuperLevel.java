package core.code.chap2._4_3_template2;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("아주 빠르게 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 turn 합니다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" *** 고급자레벨입니다 *** ");
    }
}
