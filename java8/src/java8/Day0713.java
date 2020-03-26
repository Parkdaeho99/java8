package java8;

import java.util.Scanner;

public class Day0713 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄?: ");
		int input = sc.nextInt();
		if( (input%2) == 0 ) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
		for(int i=0; i<input/2+1; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int i=input/2+1; i<input; i++) {
			for(int j=input-i; j>0; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		sc.close();
	}

}
