package java8;

import java.util.Scanner;

public class Day0502 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		int inputNumber = 0;
		System.out.println("Ȧ ¦ �Ǻ� ���α׷�");
		System.out.print("���� �Է��Ͻÿ�: ");
		inputNumber = sc.nextInt();
		//String result = inputNumber % 2 == 0 ? "¦��" : "Ȧ��";
		String result="";
		if(inputNumber % 2 == 0) 
			result = "¦��";
		 else		
			result = "Ȧ��";
		
		System.out.println("�Է��� ���ڴ�: "+inputNumber+"�̰�, "+ result +"�Դϴ�");
		sc.close();
	}

}
