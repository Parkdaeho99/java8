package java8;

import java.util.Random;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int strike = 0;
		int ball = 0;
		int com[] = new int[3];
		int user[] = new int[3];
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < com.length; i++) {
			com[i] = rd.nextInt(9) + 1;
		}
		System.out.println("start");
		System.out.print(com[0]);
		System.out.print(com[1]);
		System.out.println(com[2]);
		do {
			strike = 0;
			ball = 0;
			for(int i=0; i<com.length; i++) {
				user[i] = sc.nextInt();
			}
			for (int i = 0; i < com.length; i++) {
				if (user[i] == com[i]) {
					strike++;
				}
			}
			if (com[0] == user[1])
				ball++;
			if (com[0] == user[2])
				ball++;
			if (com[1] == user[2])
				ball++;
			if (com[2] == user[0])
				ball++;
			System.out.println(strike+" Strike!" + " " + ball+" Ball!");
		} while (strike != 3);
	}
}
