package java8;

import java.util.Random;
import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int res = rd.nextInt();
		if ( res < 0 ) {
			res = Math.abs(res);
		}
		int input = 0;
		System.out.println("정답은 >>>" + res);
		while(true) {
			if(res == input)
				break;
			System.out.print(">>>");
			input = sc.nextInt();
			
			if(input > res) {
				System.out.println("down");
			}else if(input < res) {
				System.out.println("up");
			}else
				System.out.println("정답!");
		}
		sc.close();
	}

}
