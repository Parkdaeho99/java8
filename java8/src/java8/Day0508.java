package java8;

import java.util.Scanner;

public class Day0508 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����� �Է��ϼ���:");
		String grade = sc.next();
		switch(grade){
			case "s":
			case "S":
				System.out.println("����� VIP�Դϴ�.");
				break;
			case "a":
			case "A":
				System.out.println("����� ���� �Դϴ�.");
				break;
			case "b":
			case "B":
				System.out.println("����� ����� �Դϴ�.");
			default:
				System.out.println("����� �Ϲݰ� �Դϴ�.");
		}		
		sc.close();
	}

}
