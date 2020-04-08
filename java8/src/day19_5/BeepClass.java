package day19_5;

import java.awt.Toolkit;

public class BeepClass {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		System.out.println(Thread.currentThread().getName());
		
		Thread t0 = new Thread();
		Thread t7 = new Thread();
		
		System.out.println(t0.getName());
		System.out.println(t7.getName());
		/*
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("t1쓰레드 명:"+Thread.currentThread().getName());
				tk.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("경고");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}*/
	}
}
