package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swap {

	public static void main(String[] args) throws IOException {
		// TODO �ڵ� ������ �޼ҵ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("N �Է��ϼ���.");
		String n = br.readLine();
		System.out.print("M �Է��ϼ���.");
		String m = br.readLine();
		System.out.println("���� �� N�� M�� : " + Integer.parseInt(n) + "  " + Integer.parseInt(m));
		
		String temp = n;
		n = m;
		m = temp; 
		System.out.println("���� �� N�� M�� : " + Integer.parseInt(n) + "  " + Integer.parseInt(m));
		br.close();
				
	}

}
