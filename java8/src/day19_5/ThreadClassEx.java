package day19_5;

public class ThreadClassEx {
	public static void main(String[] args) {
		Thread t1 = new ThreadClass("������1");
		Thread t2 = new ThreadClass("������2");
		t1.run();
		t2.run();
	}
}
