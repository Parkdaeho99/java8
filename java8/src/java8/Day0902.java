package java8;

import java.util.Scanner;

public class Day0902 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		/*Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		sc.close();*/
		
		/*Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=line-i; j>0; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		sc.close();*/
		
		/*Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=0; j<line-i-1; j++) {
				System.out.print("#");
			}
			for(int k=0; k<i+1; k++)
				System.out.print("@");
			System.out.println();
		}
		sc.close();*/
		System.out.print("�� �� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		// 6���̸�
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) { // 0->1 / 1->3 / 2->5 / 3->7 => i*2+1
				System.out.print("*");
			}

			System.out.println();
		}
		
		sc.close();
	}

}
