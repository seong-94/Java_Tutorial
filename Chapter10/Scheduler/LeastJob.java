package Chapter10.Scheduler;

public   class LeastJob implements Scheduler {
    
    @Override
    public void getNextCall() {
        System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");        
    }
    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담 업무가 없거나 가장 적은 상담원에게 연결합니다.");
        
    }
    
}
