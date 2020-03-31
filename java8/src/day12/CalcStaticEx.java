package day12;

public class CalcStaticEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double result1 = 10 * 10 * CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		
		CalcStatic calcs = new CalcStatic();
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("calcs.pi " + CalcStatic.pi);
		
		CalcStatic.pi = 1000;
		System.out.println(calcs.pi);
	}

}
