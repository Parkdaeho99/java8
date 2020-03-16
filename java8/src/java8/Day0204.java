package java8;

public class Day0204 {
	public static void main(String[] args) {
		double number1;
		number1 = 3.14;
		double number2 = 1.24;
		double result1 = number1 + number2;
		System.out.println(result1);
		
		float result2 = (float)(number1 + number2);
		System.out.println(result2);
		
		double result3 = 3.14 + 1.24;
		System.out.println(result3);
		
		float result4 = 3.14f + 1.24F;
		//실수의 기본형은 double
		System.out.println(result4);
		
		double result5 = 3.14f + 1.23;
		// float + double = 큰값 double로 흡수
		
		long result6 = 10 + 20L;
		
		int num1 = 100;
		System.out.println(num1);
		num1 = 200;
	}
}
