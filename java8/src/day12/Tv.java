package day12;

public class Tv {
	String com = "";
	int year = 0;
	int inch = 0;
	public Tv(String com, int year, int inch) {
		this.com = com;
		this.year = year;
		this.inch = inch;
	}
	void show() {
		System.out.println(com+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
}
