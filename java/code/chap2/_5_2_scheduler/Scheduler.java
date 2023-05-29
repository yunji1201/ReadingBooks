package core.code.chap2._5_2_scheduler;

public interface Scheduler {

    // 이 스케줄러는 두가지 일을 할거야
    // (1) 다음 고객의 콜을 가져오기
    // (2) 상담원에게 콜을 전달하기

    // strategy (정책) 구현
    // 하나씩 하나씩 넘겨준다 round
    // 대기열이 가장 짧은대로 넘겨준다 Least Job
    // 우선순위 높은 고객을 먼저 넘겨준다 priority
    // 이러한 정책들을 모두 스케쥴러 인터페이스를 implements 해야한다

    // client code는 스케줄러 타입을 구현한 어떠어떠한 클래스가 구현이 되었는지를 알 필요없이 이 스케줄러 인터페이스, 명세만을 보고 파악하기 -> 인터페이스를 기반한 코딩


    void getNextCall();

    void sendCallToAgent();
}
