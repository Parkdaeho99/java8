package day21;

public class ThreadEx {
	public static void main(String[] args) {
		Account a = new Account();
		ThreadA t1 = new ThreadA(a);
		ThreadA t2 = new ThreadA(a);
		ThreadA t3 = new ThreadA(a);
		ThreadA t4 = new ThreadA(a);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

class Account {
	public int totalMoney = 100000;
	
	public synchronized String sub(String name) {
		System.out.println(name+"�Բ��� �����ϼ̽��ϴ�.");
		if(totalMoney - 9800 < 0) {
			Thread.currentThread().interrupt();
		} else {
			totalMoney = totalMoney - 9800;
			System.out.println("���� �ݾ�: " + totalMoney);
		}
		return name+"�Բ��� �����̽��ϴ�.";
	}
}

class ThreadA extends Thread {
	Account a;
	ThreadA(Account a) {
		this.a = a;
	}

	@Override
	public void run() {
		while (true) {
			if (interrupted()) {
				System.out.println("�ܾ� ����, �����ܾ� : "+ a.totalMoney);
				break;
			}
			System.out.println(a.sub(getName()));
		}
	}
}