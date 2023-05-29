package core.code.chap2._5_2_scheduler;

import java.io.IOException;
import java.sql.Connection;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {

        Connection connection;
        // 웹서버랑 DB서버랑 연결할때
        // 인터페이스 -> 메서드 선언만 되어있음, 구현코드는 없음
        // JDBC - db가 자바랑 연결하려면 이런것들을 해야한다는 명세 같은거
        // 근데 인터페이스라서 구현코드는 없음
        // 그럼 구현은 누가해? -> DB가 ! (oracle, postgresql.. )
        // 이런데서 인터페이스에 대한걸 구현해서 jar파일을 넘겨주고 우리는 그럼 그 jar파일을 사용하는 것

        // R(RoundRobin), L(LeastJob), P(PriorityAllocation)
        System.out.println("전화 상담 배분방식을 선택하세요, R, L, P");

        int ch = System.in.read(); // 받을때

        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원하지 않는 기능입니다");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
