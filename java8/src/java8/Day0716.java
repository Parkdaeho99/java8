package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0716 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int life = 3;
		int score = 0;
		int cHand;

		String hand = "";
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("1. ����, 2. ����, 3. �� q. ����");
		while (life > 0) {
			hand = sc.next();

			if (hand.equals("q")) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}

			cHand = rd.nextInt(3) + 1;

			if (Integer.parseInt(hand) == cHand) {
				score = score + 10;
				System.out.println("�����ϴ�.");
			} else if ((Integer.parseInt(hand) == 1) && (cHand == 2) 
					|| (Integer.parseInt(hand) == 2) && (cHand == 3)
					|| (Integer.parseInt(hand) == 3 && cHand == 1)) {
				life--;
				if (cHand == 3)
					System.out.println("��ǻ�� ��" + "\t" + "��ǻ�Ͱ� �� ��-" + "��");
				else if (cHand == 1)
					System.out.println("��ǻ�� ��" + "\t" + "��ǻ�Ͱ� �� ��-" + "����");
				else if (cHand == 2)
					System.out.println("��ǻ�� ��" + "\t" + "��ǻ�Ͱ� �� ��-" + "����");
			} else if ((Integer.parseInt(hand) == 1) && (cHand == 3) 
					|| (Integer.parseInt(hand) == 2) && (cHand == 1)
					|| (Integer.parseInt(hand) == 3) && (cHand == 2)) {
				score = score + 100;
				if (cHand == 3)
					System.out.println("���� ��" + "\t" + "��ǻ�Ͱ� �� ��-" + "��");
				else if (cHand == 1)
					System.out.println("���� ��" + "\t" + "��ǻ�Ͱ� �� ��-" + "����");
				else if (cHand == 2)
					System.out.println("���� ��" + "\t" + "��ǻ�Ͱ� �� ��-" + "����");
			} else {
				System.out.println("�߸��� ����");
				System.exit(0);
			}
		}
		System.out.println("���ھ�: " + score);
		sc.close();
	}
}
