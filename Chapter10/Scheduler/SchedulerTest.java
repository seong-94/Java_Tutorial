package Chapter10.Scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {//
        System.out.println("전화 상담 할당 방식을 선택하세요.");

        int ch = System.in.read(); // 할당 방식을 입력 받아 ch 변수에 대입
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') { // 입력받은 값이 R,r 이면 RoundRobin 클래스 생성
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') { // 입력받은 값이 L,l 이면 LeastJob 클래스 생성
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') { // 입력받은 값이 P,p 이면 ProityAllocation 클래스 생성
            scheduler = new PriortyAllocation();
        } else if (ch == 'A' || ch == 'a') {
            scheduler = new AgentGetCall();
        } else {
            System.out.println("지원 되지 않는 기능 입니다.");
            // return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }

}
