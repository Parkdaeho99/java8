package day20;

public class TargetThread extends Thread {
	public void run() {
		String sum = "";
		for (long i = 0; i < 30000; i++) {
			sum += i;
		}

		try {
			Thread.sleep(1500);
		} catch (Exception e) {
		}

		for (long i = 0; i < 30000; i++) {
			sum+=i;
		}
	}
	
	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
	}
}
