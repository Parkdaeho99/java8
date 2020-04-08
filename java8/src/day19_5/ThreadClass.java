package day19_5;

public class ThreadClass extends Thread {
	private String name;

	ThreadClass(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(name + " ");
			}
		} catch (Exception e) {}
	}
}
