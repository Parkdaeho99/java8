package java8;

import java.util.Random;
import java.util.Scanner;

public class Mabangjin {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.print("ũ�� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if( (input%2) == 0 ) {
			System.out.println("���α׷� ����");
			System.exit(0);
		}
		
		int size = sc.nextInt();
		int res = (size*size*size + size) / 2; //������ ������
		int array[];
		
		Random rd = new Random();
		
		
		
		
	}

}
