package day20;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		//how1
		/*try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}*/ //인터럽트가 발생하면
		
		//how2
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) { //인터럽트가 발생하면
				break; //일부러 인터럽트를 발생시켜서 쓰레드 종료
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
