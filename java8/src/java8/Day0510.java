package java8;

import java.util.Scanner;

public class Day0510 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.print("����, ����, �� �� �ϳ��� �����ϼ��� (����=a, ����=b, ��=c): ");
		Scanner sc = new Scanner(System.in);
		String m_hand = sc.next();
		String c_hand = "";
		
		int temp = (int)(Math.random() * 3);

		if(temp == 0) {
			c_hand = "a";
		}else if(temp == 1) {
			c_hand = "b";
		}else {
			c_hand = "c";
		}
		
		System.out.println(m_hand + c_hand);
		/*m_hand = "a";
		c_hand = "b";*/
		System.out.println(m_hand);System.out.println(c_hand);
		/* m_hand=="a" && c_hand=="c" �̷��� ���ϸ�,
		 * m_hand�� c_hand�� �⺻�ڷ����� �ƴϱ� ������
		 * (String�� �⺻ �ڷ����� �ƴϴ�)
		 * m_hand�� c_hand�� ���� ���� �ٷ� ������ �ʰ�,
		 * ���� ����� �ּҸ� ����Ų��.
		 * �׷��� m_hand=="a"�� m_hand�� ����ִ� ���̶� "a"�� �ּҰ� ����?
		 * ��� ���� ����.
		 * ���� ���� ���ؾ� �ϱ� ������ equals�� ���ش�.*/
		if(m_hand.equals("a") && c_hand.equals("a")) {
			System.out.println("�����ϴ�.");
			System.out.println("��ǻ��:����, ���:����");
		}
		if(m_hand.equals("a") && c_hand.equals("b")) {
			System.out.println("�����ϴ�.");
			System.out.println("��ǻ��:����, ���:����");
		}
		if(m_hand=="a" && c_hand=="c") {
			System.out.println("�̰���ϴ�.");
			System.out.println("��ǻ��:��, ���:����");/////////
		}
		if(m_hand=="b" && c_hand=="b") {
			System.out.println("�����ϴ�.");
			System.out.println("��ǻ��:����, ���:����");
		}
		if(m_hand=="b" && c_hand=="c") {
			System.out.println("�����ϴ�.");
			System.out.println("��ǻ��:��, ���:����");
		}
		if(m_hand=="b" && c_hand=="a") {///////
			System.out.println("�̰���ϴ�.");
			System.out.println("��ǻ��:����, ���:����");
		}
		if(m_hand=="c" && c_hand=="c") {
			System.out.println("�����ϴ�.");
			System.out.println("��ǻ��:��, ���:��");
		}
		if(m_hand=="c" && c_hand=="a") {
			System.out.println("�����ϴ�.");
			System.out.println("��ǻ��:����, ���:��");
		}
		if(m_hand=="c" && c_hand=="b") {/////////
			System.out.println("�̰���ϴ�.");
			System.out.println("��ǻ��:����, ���:��");
		}

		sc.close();
	}

}
