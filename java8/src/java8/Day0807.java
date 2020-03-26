package java8;

import java.util.Scanner;

public class Day0807 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("두 수 입력 > ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = 0;

		if (num1 == num2) {
			res = num1;
			System.out.println("결과 >" + res);
			System.exit(0);
		}

		if (num1 > num2) { // 5 , 3
			for (int i = num2; i <= num1; i++) {
				res = res + i;
			}
		} else { // 3 , 5
			for (int i = num1; i <= num2; i++) {
				res = res + i;
			}
		}

		System.out.println("결과 >" + res);

		sc.close();
	}

}
