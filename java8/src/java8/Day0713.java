package java8;

import java.util.Scanner;

public class Day0713 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ��?: ");
		int input = sc.nextInt();
		if( (input%2) == 0 ) {
			System.out.println("���α׷� ����");
			System.exit(0);
		}
		
		for(int i=0; i<input/2+1; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int i=input/2+1; i<input; i++) {
			for(int j=input-i; j>0; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		sc.close();
	}

}
