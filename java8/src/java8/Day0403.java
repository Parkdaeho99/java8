package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {

	public static void main(String[] args) throws IOException {
		// TODO �ڵ� ������ �޼ҵ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// scanner�� �޸� ���ڸ� �Է¹��� �� ���� �׷��� �ؿ��� parseint
		System.out.println("Ű���带 ������ ���ڿ��� �Է��ϼ���:");
		String str = br.readLine(); // ���ۿ� �� ���ڸ� �о��
		System.out.println(str);
		
		System.out.println("���ڸ� �Է��� �ּ���.:");
		String number = br.readLine();
		int num = Integer.parseInt(number);
		System.out.println(num);
		
		br.close();
		isr.close();
	}

}
