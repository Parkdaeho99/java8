package java8;

import java.util.Scanner;

public class Day0509 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("a:�Ƹ޸�ī��, c:īǪġ��, l:ī���, m:ī���ī");
		System.out.print("�ϳ��� �Է��ϼ���: ");
		String choice = sc.next();
		
		switch(choice) {
		case"a":
		case"A":
			System.out.println("�Ƹ޸�ī�� ���Խ��ϴ�.");
			break;
		case"c":
		case"C":
			System.out.println("īǪġ�� ���Խ��ϴ�.");
			break;
		case"l":
		case"L":
			System.out.println("ī��� ���Խ��ϴ�.");
			break;
		default:
			System.out.println("ī���ī ���Խ��ϴ�.");
		}
		sc.close();
	}

}
