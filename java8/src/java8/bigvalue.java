package java8;

import java.util.Scanner;

public class bigvalue {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է�:");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է�:");
		int num2 = sc.nextInt();
		System.out.println("ù��°����"+num1+"�ι�°����"+num2);
		System.out.println("�� ū ���� "+ (num1>num2?num1:num2) +"�Դϴ�");
		sc.close();
	}
 
}
