package day19_1;

public class Calculator {
	public static int staticMetohd(int x, int y) {
		System.out.println("����ƽ�޼ҵ�");
		return x+y;
	}
	
	public int instanceMetohd(int x, int y) {
		System.out.println("�Ϲݸ޼ҵ�");
		return x+y;
	}
}
