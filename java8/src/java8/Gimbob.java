package java8;

import java.util.Scanner;

public class Gimbob {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("--------------------------------------------------------------------");
		System.out.println("�޴�"+"\t\t\t\t"+"����(��)"+"\t\t"+"�ֹ�");
		System.out.println("��� 1��"+"\t\t\t"+"2,000��"+"\t\t\t"+"1");
		System.out.println("������ 1�κ�"+"\t\t\t"+"2,000��"+"\t\t\t"+"1");
		System.out.println("���� 1�κ�"+"\t\t\t"+"500��"+"\t\t\t"+"4");
		System.out.println("���� 1�κ�"+"\t\t\t"+"2,000��"+"\t\t\t"+"1");
		System.out.println("--------------------------------------------------------------------");
		
		
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�ֹ��ϱ�> ");
			input = sc.nextLine();
			if(input.equals("���")) {
				System.out.println("��� �����ϼ̽��ϴ�.");
			}
				
				
			System.out.print("��� �ֹ��Ͻðڽ��ϱ�? > ");
			
			
			if(input.equals("n") || input.equals("no") || input.equals("�ƴϿ�") || input == "�ƴϿ�" || input == "�ƴ�")
				break;
				
		}
		
		
		
		
	}

}
