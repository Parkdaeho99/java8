package java8;

import java.util.Scanner;

public class Day0802 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		// for(int i=0; i<10; i++) System.out.println("Hello "+i);

		// for(int i=9; i>-1; i--) System.out.println("Hello "+i);

		// for(int i=0; i<7; i++) System.out.println("@@@@@");

		/*
		 * for (int i = 0; i < 7; i++) { for (int j = 0; j < 5; j++) {
		 * System.out.print("@"); } System.out.println(); }
		 */
		/*for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 1 || j == 3) {
					System.out.print("#");
					continue;
				}
				System.out.print("@");
			}
			System.out.println();
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 > ");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++)
			System.out.println(str.charAt(i));
		System.out.println();
	}
}
