package java8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Դϱ�?(����: 1, �����ƴ�: 0) - ");
		int num1 = sc.nextInt();
		System.out.print("�α�(����: �鸸) - ");
		int num2 = sc.nextInt();
		System.out.print("������ ��(����: �鸸) - ");
		int num3 = sc.nextInt();
		String result = (num1!=0) && (num2>=100) && (num3>=50) ? "true" : "false";  
		System.out.print("��Ʈ�������� ����: " + result);
		sc.close();
		
	}

}
