package java8;

import java.util.Scanner;

public class Ch0301 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int input = sc.nextInt();
		int cnt = 0;
		int sum=0;
		System.out.println("�Է°�>"+input);
		for(int i=1; i<=input; i++) {
			if(i % 5 == 0) {
				sum = sum + i;
				cnt++;
			}
		}
		System.out.println("5�� ����� ����>"+cnt);
		System.out.println("5�� ����� ��>"+sum);
		sc.close();
	}

}
