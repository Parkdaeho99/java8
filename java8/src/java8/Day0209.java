package java8;

import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��� �ּ���:");
		String name = sc.nextLine();
		System.out.print(name + "���� ������ ����� ");
		System.out.println((int)(Math.random()*51)+50 + "%�Դϴ�");
		sc.close();
	}

}
