package java8;

import java.util.Scanner;

public class Day0503 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int score = sc.nextInt();
		String pass ="";
		if(score >= 90) pass = "A����";
		else if ( score >= 80) pass = "B����";
		else if ( score >= 70) pass = "C����";
		else if ( score >= 60) pass = "D����";
		else pass = "F����";
		
		System.out.println("���� ������" + pass + "�Դϴ�");
		sc.close();
	}

}
