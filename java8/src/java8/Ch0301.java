package java8;

import java.util.Scanner;

public class Ch0301 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int input = sc.nextInt();
		int cnt = 0;
		int sum=0;
		System.out.println("입력값>"+input);
		for(int i=1; i<=input; i++) {
			if(i % 5 == 0) {
				sum = sum + i;
				cnt++;
			}
		}
		System.out.println("5의 배수의 개수>"+cnt);
		System.out.println("5의 배수의 합>"+sum);
		sc.close();
	}

}
