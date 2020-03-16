package java8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) - ");
		int num1 = sc.nextInt();
		System.out.print("인구(단위: 백만) - ");
		int num2 = sc.nextInt();
		System.out.print("부자의 수(단위: 백만) - ");
		int num3 = sc.nextInt();
		String result = (num1!=0) && (num2>=100) && (num3>=50) ? "true" : "false";  
		System.out.print("메트로폴리스 여부: " + result);
		sc.close();
		
	}

}
