package core.code.chap3._3_inner_class;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    /*
    getRunnable()은 메서드이고, MyRunnable이라는 클래스를 만들어서 Runnble한 객체를 구현을 해서 return new MyRunnable을 통해 생성을 해서 반환.
     */
    public Runnable getRunnable(int i) { // 스레드를 생성하는 인터페이스 Runnable
        int localNum = 100; // 메서드안에 선언된 변수
        return new Runnable() {
            @Override
            public void run() {
                outNum += 10;

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        };
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable(20).run();

        Runnable runnable = outer.getRunnable(20);
        runnable.run();
    }
}


// localNum += 100;
// i += 200;
// 위에 구현된게 모두 에러가 나는 이유는,
// 위에서 로컬변수 localNum과 매개변수 i가 선언되면 곧바로 스택에 쌓이게되는데
// 한번 호출되고 메서드 로딩후 사라질 수 있어서 이쪽을 구현할떄는 이미 다 끝나고 사라질 수있으므로
// 여기에서 다시 수정같은거 못함 (이부분어렵네 - 내부클래스 강의 약 27분쯤)