package java8;

import java.util.Scanner;

public class Day0501 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int inputNumber = 0;
		System.out.println("홀 짝 판별 프로그램");
		System.out.print("숫자 입력하시오: ");
		inputNumber = sc.nextInt();
		//String result = inputNumber % 2 == 0 ? "짝수" : "홀수";
		String result="";
		if(inputNumber % 2 == 0) {
			result = "짝수";
		}
		if (inputNumber % 2 != 0) {
			result = "홀수";
		}
		System.out.println("입력한 숫자는: "+inputNumber+"이고, "+ result +"입니다");
		sc.close();
	}

}
