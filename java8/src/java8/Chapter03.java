package java8;

import java.util.Scanner;

public class Chapter03 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���� �Ǻ� ���α׷�");
		System.out.print("������ �Ǻ��� �⵵ �Է�! : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); //1804
		int year1 = year%4; // 0
		int year2 = year%100; // 4
		int year3 = year%400; // 204
		
		/*if (year1 == 0) {
			if (year2 == 0) {
				System.out.println("���");
				System.exit(0);
			}
			System.out.println("���");
		}
		
		if (year1==0 && year2%100==0) {
			if (year3==0) {
				System.out.println("����");
			}
			System.out.println("���");
		}*/
		
		if (year1 == 0 && year2 == 0 && year3 == 0)
			System.out.println("����");
		else if(year1 == 0 && year2 == 0 && year3 != 0)
			System.out.println("���");
		else if(year1 == 0)
			System.out.println("����");
		else
			System.out.println("���");
		sc.close();
	}

}
