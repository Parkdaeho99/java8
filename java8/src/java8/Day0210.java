package java8;

public class Day0210 {

	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		System.out.println("사과 한 개를 10조각으로 나눠서");
		System.out.println("7조각을 먹었습니다.");
		System.out.println("남은 조각은 몇 조각일까요?");
		double result = apple - unit * 7;
		System.out.println(result);
		/*실수는 정확하게 연산하지 않는다. 
		그러므로 정수로 먼저 계산 후 실수로 표현*/
		int apple2 = 1;
		double unit2 = 1;
		double result2 = (apple2 * 10 - unit2 * 7) / 10;
		System.out.println(result2);
	}

}
