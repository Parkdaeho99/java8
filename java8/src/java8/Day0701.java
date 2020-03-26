package java8;

import java.util.Scanner;

public class Day0701 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("두 수를 입력:");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String res = num1 == num2 ? "Same" : "Different";
		
		System.out.println(res);
		
		sc.close();
		

	}

}
