package day17;

public class CounterEx {
	public static void main(String[] args) throws Throwable {
		Counter counter = null;
		for(int i=1; i<=10; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
		}
		
		
	}
}
