package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {

	public static void main(String[] args) throws IOException {
		// TODO �ڵ� ������ �޼ҵ� ����
		InputStreamReader isr = new InputStreamReader(System.in); 
		//�ƹ��� ���� �Է¹޾ƺ��� �ϳ����ۿ� ������������?
		BufferedReader br = new BufferedReader(isr);
		//�׷��� ���۸� ������ְ� ��ǲ��Ʈ�������κ��� ���ڸ� �о����
		int temp = isr.read(); // �ϳ����ۿ� �������� ���ؼ� �Ѱ����� ����?
		int temp1 = isr.read(); //�������Ż��� �������� ������
		System.out.println(temp);
		System.out.println(temp1);
		/*isr�̳� br�̳� �Ѵ� ���� ���۸� �����ϴµ�?*/
		System.out.println(br.readLine()); //������ ���ۿ��� �� �������Ⱑ��
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
