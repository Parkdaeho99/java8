package java8;

import java.util.Scanner;

public class Chapter02Q_1 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.print("�̸�, �й�, ���������� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		System.out.println("�� �̸��� : "+ a +"�Դϴ�");
		System.out.println("�� �й��� : "+ Integer.parseInt(b) +"�Դϴ�");
		System.out.println("�� ���������� : "+ Integer.parseInt(c) +"�Դϴ�");
		sc.close();
	}

}
