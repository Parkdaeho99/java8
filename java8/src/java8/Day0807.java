package java8;

import java.util.Scanner;

public class Day0807 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.print("�� �� �Է� > ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = 0;

		if (num1 == num2) {
			res = num1;
			System.out.println("��� >" + res);
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

		System.out.println("��� >" + res);

		sc.close();
	}

}
