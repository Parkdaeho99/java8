package java8;

import java.util.Scanner;

public class Day1109 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int mul=num1*num2;
			if(mul<=500)
				System.out.println("두 수의 곱>"+mul);
			else break;
		}
		sc.close();
	}

}
