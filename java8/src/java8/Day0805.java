package java8;

import java.util.Scanner;

public class Day0805 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		if(line%2 == 0) {
			System.out.println("홀수만 입력하세요");
			System.exit(0);
		}
		
		for(int i=0; i<line/2+1; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int i=line/2+1; i<line; i++) { //5 6 7 8
			for(int j=line-i; j>0; j--) { //4 3 2 1
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
