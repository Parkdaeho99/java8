package day12;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) throws IOException {
		// TODO �ڵ� ������ �޼ҵ� ����
			
		System.out.print("����� ���ڿ��� �Է��ϼ���: ");
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader inbr = new BufferedReader(isr);
//		String instr = inbr.readLine();
		Scanner sc = new Scanner(System.in);
		String instr = sc.nextLine();
		StringBuffer str = new StringBuffer(instr);
		System.out.println("�Է��� ���ڿ� : " + str);
		System.out.println("�Ųٷ� ��� : " + str.reverse());
		sc.close();
	}

}
