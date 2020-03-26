package java8;

import java.util.Scanner;

public class Day0804 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		sc.close();
	}

}
