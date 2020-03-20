package java8;

import java.util.Scanner;

public class bigvalue {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력:");
		int num2 = sc.nextInt();
		System.out.println("첫번째수는"+num1+"두번째수는"+num2);
		System.out.println("더 큰 수는 "+ (num1>num2?num1:num2) +"입니다");
		sc.close();
	}
 
}
