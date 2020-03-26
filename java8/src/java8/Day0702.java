package java8;

import java.util.Scanner;

public class Day0702 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("숫자 입력: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = ((num%2)==0)?"짝수":"홀수";
		System.out.println(res);
		sc.close();
	}

}
