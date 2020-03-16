package java8;

import java.util.Random;

public class Day0304 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num1 = 10;
		int num2 = 3;
		
		int res1 = num1 + num2;
		int res2 = num1 - num2;
		int res3 = num1 * num2;
		int res4 = num1 / num2;
		int res5 = num1 % num2;
		double res6 = num1 / num2; // 정수 나누기 정수 = 정수
		double res7 = num1 / (double)num2;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		System.out.println(res7);
		
		int res8 = num1 % 2;
		System.out.println(res8);
		
		Random rd = new Random();
		int num3 = rd.nextInt();
		System.out.println(num3);
		int res9 = Math.abs(num3) % 45 + 1; // 0~44 +1 -> 1~45
		// 어떤수든간에 45로 나눠서 나머지가 생기면 45로 못나눴단 소리이고
		// 45로 못 나눴으니 45보다 작은 수를 나누려했다는걸 알수있음
		// 즉 0~44를 45로 나누려했기에 나머지가 0~44임
		System.out.println(res9);
	}

}
