package java8;

import java.util.Scanner;

public class Day0702 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.print("���� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = ((num%2)==0)?"¦��":"Ȧ��";
		System.out.println(res);
		sc.close();
	}

}
