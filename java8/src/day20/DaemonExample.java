package day20;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //데몬쓰레드로 만든다.
		autoSaveThread.start(); //작업 내용을 저장함을 계속 출력하다가

		try {
			Thread.sleep(3000); //메인 쓰레드가 3초간 멈췄다가 프로그램 종료 
		} catch (InterruptedException e) {	}
		System.out.println("메인 스레드 종료");
		/*만약 데몬스레드가 아니면 autoSaveThread랑 메인Thread가 따로따로 움직여서
		 * 메인Thread가 종료돼도 autoSaveThread는 계속 실행 상태라서 "작업 내용을 저장함"이 계속 출력됨*/
	}
}
