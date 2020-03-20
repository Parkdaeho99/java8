package java8;

import java.util.Scanner;

public class LAB {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요");
		int num1 = sc.nextInt();
		System.out.print("세로를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("사각형의 넓이:" + num1*num2);
		System.out.println("사각형의 둘레:" + 2*(num1+num2));
		sc.close();
	}

}
