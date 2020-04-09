package day20_2;

public class ThreadClassE1 extends Thread{
	int delay;
	public ThreadClassE1 t;
	ThreadClassE1(String name, int delay){
		super(name);
 		this.delay = delay;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(getName()+" ");
				sleep(delay);
			}
		} catch (InterruptedException e) {
			System.out.println("error");
			return;
			}
	}
	
	public static void main(String[] args) {
		ThreadClassE1 t1 = new ThreadClassE1("쓰레드1", 500);
		ThreadClassE1 t2 = new ThreadClassE1("쓰레드2", 700);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		t1.start();
		t2.start();
	}

}
