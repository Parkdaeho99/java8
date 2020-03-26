package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0904 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		long stime = System.currentTimeMillis();
		System.out.println(stime);
		for (int i = 0; i < 5; i++) {
			int num1 = rd.nextInt(9) + 1;
			int num2 = rd.nextInt(9) + 1;
			System.out.print(num1 + "*" + num2 + " = ");
			int input = sc.nextInt();

			if (input == num1 * num2)
				System.out.println("정답!");
			else {
				System.out.println("땡!");
				System.out.println("게임 오버!");
				System.exit(0);
			}
		}
		long etime = System.currentTimeMillis();
		System.out.println(etime);
		
		System.out.print("총 플레이 시간 > "+ (etime-stime)/1000.0+"초");
		sc.close();
	}

}
