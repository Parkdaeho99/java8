package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0716 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int life = 3;
		int score = 0;
		int cHand;

		String hand = "";
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("1. 가위, 2. 바위, 3. 보 q. 종료");
		while (life > 0) {
			hand = sc.next();

			if (hand.equals("q")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}

			cHand = rd.nextInt(3) + 1;

			if (Integer.parseInt(hand) == cHand) {
				score = score + 10;
				System.out.println("비겼습니다.");
			} else if ((Integer.parseInt(hand) == 1) && (cHand == 2) 
					|| (Integer.parseInt(hand) == 2) && (cHand == 3)
					|| (Integer.parseInt(hand) == 3 && cHand == 1)) {
				life--;
				if (cHand == 3)
					System.out.println("컴퓨터 승" + "\t" + "컴퓨터가 낸 것-" + "보");
				else if (cHand == 1)
					System.out.println("컴퓨터 승" + "\t" + "컴퓨터가 낸 것-" + "가위");
				else if (cHand == 2)
					System.out.println("컴퓨터 승" + "\t" + "컴퓨터가 낸 것-" + "바위");
			} else if ((Integer.parseInt(hand) == 1) && (cHand == 3) 
					|| (Integer.parseInt(hand) == 2) && (cHand == 1)
					|| (Integer.parseInt(hand) == 3) && (cHand == 2)) {
				score = score + 100;
				if (cHand == 3)
					System.out.println("유저 승" + "\t" + "컴퓨터가 낸 것-" + "보");
				else if (cHand == 1)
					System.out.println("유저 승" + "\t" + "컴퓨터가 낸 것-" + "가위");
				else if (cHand == 2)
					System.out.println("유저 승" + "\t" + "컴퓨터가 낸 것-" + "바위");
			} else {
				System.out.println("잘못된 접근");
				System.exit(0);
			}
		}
		System.out.println("스코어: " + score);
		sc.close();
	}
}
