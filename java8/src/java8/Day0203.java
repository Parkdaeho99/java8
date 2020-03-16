package java8;

public class Day0203 {

	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000;
		int result = number1 + number2;
		/* int 범위 -21억 ~ 21억인데,
		 * num1 + num2의 값이 30억이라
		 * 오버플로우 발생 */
		System.out.println(result);
		
		long result2 = number1 + number2;
		System.out.println(result2);
		
		long num3 = 1000000000;
		long num4 = 2000000000;
		long result3 = num3 + num4;
		System.out.println(result3);
		
		long result4 = 1000000000l + 2000000000L;
		/* 오버플로우 발생 -> 숫자만 쓰면 디폴트값이 int임 */
		System.out.println(result4);
		
		byte num5 = 15;
		byte num6 = 1;
		int result5 = num5 + num6;
		System.out.println(result5);
		// byte + byte = int
		
		short num7 = 3000;
		short num8 = 5000;
		int result6 = num7 + num8;
		System.out.println(result6);
		// short + short = int
		
		long result7 = num7 + num8;
		
	}

}
