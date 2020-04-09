package day20;

public class JoinEx {
	public static void main(String[] args) {
		SumThread t = new SumThread();
		t.start();
		try {
			Thread.sleep(10);
			t.join(); //t가 터미네이트(종료)될떄가지 멈춤
		} catch (InterruptedException e) {}
			
		System.out.println(t.getSum());
		System.out.println(t.getSum());
	}
}
