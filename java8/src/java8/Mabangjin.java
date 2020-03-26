package java8;

import java.util.Random;
import java.util.Scanner;

public class Mabangjin {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("크기 입력: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if( (input%2) == 0 ) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
		int size = sc.nextInt();
		int res = (size*size*size + size) / 2; //마방진 덧셈값
		int array[];
		
		Random rd = new Random();
		
		
		
		
	}

}
