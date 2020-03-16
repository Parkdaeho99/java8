package java8;

import java.util.Random;
import java.util.Scanner;


public class Day0207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println(rd.nextInt());
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextGaussian());
		System.out.println(rd.nextInt(10)); // 0~9

		System.out.println(Math.random());
		// Math 클래스는 기본지원 클래스이므로 임포트 X
		
		
	}

}
