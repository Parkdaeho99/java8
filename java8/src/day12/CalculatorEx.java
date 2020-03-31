package day12;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Calculator calc = new Calculator();
		calc.powerOn();
		System.out.println(calc.plus(2, 2));
		
		byte num1 = 10;
		byte num2 = 3;
		double res2 = calc.divide(num1, num2);
		System.out.println(res2);
		
		long num3 = 100;
		long num4 = 30;
		double res3 = calc.plus(num3, num4);
		System.out.println(res3);
		calc.powerOff();

	}

}
