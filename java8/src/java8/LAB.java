package java8;

import java.util.Scanner;

public class LAB {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���θ� �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.print("���θ� �Է��ϼ���");
		int num2 = sc.nextInt();
		System.out.println("�簢���� ����:" + num1*num2);
		System.out.println("�簢���� �ѷ�:" + 2*(num1+num2));
		sc.close();
	}

}
