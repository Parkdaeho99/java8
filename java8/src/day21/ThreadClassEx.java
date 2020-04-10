package day21;

public class ThreadClassEx extends Thread{
	int delay;
	int cnt = 0;
	public ThreadClassEx(String name, int delay) {
		super(name);
		this.delay = delay;
	}
	
	@Override
	public void run() {
		try {
			while(cnt < 5) {
				System.out.println(getName());
				sleep(delay);
				cnt++;
			}
		} catch (InterruptedException e) {}
	}
	
	public static void main(String[] args) {
		ThreadClassEx t1 = new ThreadClassEx("쓰레드1", 300);
		ThreadClassEx t2 = new ThreadClassEx("쓰레드2", 800);
		ThreadClassEx t3 = new ThreadClassEx("쓰레드3", 400);
		t1.start();
		t2.start();
		t3.start();
	}
	
}
