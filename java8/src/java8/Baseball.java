package java8;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		// 375 , �迭�Ἥ?
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int rightAnswer[] = new int[3]; // ����
		int answer[] = new int[3]; // ������Է�
		rightAnswer[0] = rd.nextInt(9) + 1; // 1~9
		rightAnswer[1] = rd.nextInt(9) + 1; // 1~9
		rightAnswer[2] = rd.nextInt(9) + 1; // 1~9
		System.out.println(rightAnswer[0]+""+rightAnswer[1]+""+rightAnswer[2]);
		System.out.println("�߱� ���� ����!");
		while (true) {
			for (int i = 0; i < 3; i++) {
				answer[i] = sc.nextInt();
			}
			System.out.println(answer[0]+" "+answer[1]+" "+answer[2]);
			if (answer[0] == rightAnswer[0] && answer[1] == rightAnswer[1] && answer[2] == rightAnswer[2]) {
				System.out.println("3 Strike!");
				break;
			} else if (answer[0] == rightAnswer[0] && answer[1] == rightAnswer[1] || answer[1] == rightAnswer[1] && answer[2] == rightAnswer[2]	|| answer[2] == rightAnswer[2] && answer[0] == rightAnswer[0]) {
				System.out.println("2 Strike!");
				continue;
			} else if (answer[0] == rightAnswer[0] || answer[1] == rightAnswer[1] || answer[2] == rightAnswer[2]) {
				System.out.println("1 Strike!");
				continue;
			} else if (answer[0] == rightAnswer[1] && answer[1] == rightAnswer[2] && answer[2] == rightAnswer[0] || answer[1] == rightAnswer[2] && answer[2] == rightAnswer[0] && answer[0] == rightAnswer[1] ) {
				System.out.println("3 Ball!");
				continue;
			} else if (answer[0] == rightAnswer[1] && answer[1] == rightAnswer[2] || answer[1] == rightAnswer[2] && answer[2] == rightAnswer[0] || answer[2] == rightAnswer[0] && answer[0] == rightAnswer[1]) {
				System.out.println("2 Ball!");
				continue;
			} else if (answer[0] == rightAnswer[1] || answer[0] == rightAnswer[2] || answer[1] == rightAnswer[0] || answer[1] == rightAnswer[2] || answer[2] == rightAnswer[0] || answer[2] == rightAnswer[1] ) {
				System.out.println("1 Ball!");
				continue;
			} else {
				System.out.println("0 Ball!");
				continue;
			}
		}
		sc.close();
	}

}
