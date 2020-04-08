package day19_1;

public class Calculator {
	public static int staticMetohd(int x, int y) {
		System.out.println("스태틱메소드");
		return x+y;
	}
	
	public int instanceMetohd(int x, int y) {
		System.out.println("일반메소드");
		return x+y;
	}
}
