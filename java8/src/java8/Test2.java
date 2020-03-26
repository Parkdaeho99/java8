package java8;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		for(int i=0; i<line/2+1; i++) {
			for(int j=0; j<line/2-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=line/2+1; i<line; i++) { // i=5 6 7 8
			for(int j=0; j<i-4; j++) { // j=1 2 3 4
				System.out.println(" ");
			}
		}
		
		sc.close();
	}
}
