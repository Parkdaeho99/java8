package java8;

import java.util.Scanner;

public class Day0606 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단: ");
		int j=sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(j*i);
		}
		sc.close();

	}

}
