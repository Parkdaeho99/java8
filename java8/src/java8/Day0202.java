package java8;

import java.util.Scanner;

public class Day0202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1, number2;
		System.out.print("숫자 두개를 띄어쓰기로 구분하여 입력: ");
		/*System.out.print("첫번째 숫자를 입력하세요.: ");
		number1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요.: ");
		number2 = sc.nextInt();*/
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		System.out.println(number1+number2);
		sc.close();
	}
}
