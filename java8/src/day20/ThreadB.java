package day20;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	@Override
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThareB �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
