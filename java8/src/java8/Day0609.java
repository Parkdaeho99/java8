package java8;

import java.util.Scanner;

public class Day0609 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int score = 0;
		int life = 5;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("����, ����, �� �� �ϳ��� �����ϼ��� (����=a, ����=b, ��=c, ����=q): ");
			
			
			String m_hand = sc.next(); // ���ͷ��� ���� �ʾƼ�
			// System.out.println(System.identityHashCode("a")); //421
			// System.out.println(System.identityHashCode(m_hand)); // 104
			// m_hand�� ���ͷ��� �Ἥ �����Ѱ� �ƴ϶� ���ο� ��������
			// System.out.println(System.identityHashCode("a")); // 421
			// ���� ���� a�� �޸𸮿� �ö� ��ġ 421�ּ�,
			// ��� ������ a�� ��� 421�ּҿ� �ִ�
			// ���Ӱ� �޸𸮿� �ø��� �ʴ� �̻�
			if(m_hand.equals("q"))
				System.exit(0);
			String c_hand = "";

			int temp = (int) (Math.random() * 3);

			if (temp == 0) {
				c_hand = "a";
				// System.out.println(System.identityHashCode(c_hand)); //421
				// c_hand�� ���ͷ��� ���� ������ ������ �� "a"�� ���� �����̴�.
			} else if (temp == 1) {
				c_hand = "b";
			} else {
				c_hand = "c";
			}

			// System.out.println(m_hand + c_hand);
			/*
			 * m_hand = "a"; c_hand = "b";
			 */
			/*
			 * String�� �⺻ �ڷ����� �ƴϰ� ��ü�� �� ��ü�� ������ �ʰ�, ���� ���� ������ �����Ѵ�. �׷��Ƿ� == �����ڷ� ���ϸ� �ȵǰ�,
			 * equals�� �Ἥ ���ؾ� �Ѵ�. == �����ڴ� �� ���� ���� ���ϴ� �ǵ�, �Ʒ� �ڵ忡�� m_hand == "a" �κ���
			 * m_hand�� String�̱� ������ ������ �ּҰ��� ������ �ֱ� ������ == �����ڸ� ����ϸ� m_hand�� �ּҰ��� "a"�� ���İ�
			 * ���� ��?
			 * 
			 */
			// System.out.println(System.identityHashCode("a")); // 421

			if (m_hand.equals("a") && c_hand.equals("a")) {
				// System.out.println(System.identityHashCode(m_hand)); // 104
				// System.out.println(System.identityHashCode(c_hand)); // 421
				// System.out.println(System.identityHashCode("a")); // 421
				System.out.println("�����ϴ�.");
				System.out.println("��ǻ��:����, ���:����");
			}
			if (m_hand.equals("a") && c_hand.equals("b")) {
				System.out.println("�����ϴ�.");
				System.out.println("��ǻ��:����, ���:����");
				life--;
			}
			if (m_hand.equals("a") && c_hand.equals("c")) {
				// "a"�� �ִ� 421�����̶� "c"�� �ִ� �����̶� ����?
				// ���� ����������.
				System.out.println("�̰���ϴ�.");
				System.out.println("��ǻ��:��, ���:����");/////////
				score++;
			}
			if (m_hand.equals("b") && c_hand.equals("b")) {
				System.out.println("�����ϴ�.");
				System.out.println("��ǻ��:����, ���:����");
			}
			if (m_hand.equals("b") && c_hand.equals("c")) {
				System.out.println("�����ϴ�.");
				System.out.println("��ǻ��:��, ���:����");
				life--;
			}
			if (m_hand.equals("b") && c_hand.equals("a")) {///////
				System.out.println("�̰���ϴ�.");
				System.out.println("��ǻ��:����, ���:����");
				score++;
			}
			if (m_hand.equals("c") && c_hand.equals("c")) {
				System.out.println("�����ϴ�.");
				System.out.println("��ǻ��:��, ���:��");
			}
			if (m_hand.equals("c") && c_hand.equals("a")) {
				System.out.println("�����ϴ�.");
				System.out.println("��ǻ��:����, ���:��");
				life--;
			}
			if (m_hand.equals("c") && c_hand.equals("b")) {/////////
				System.out.println("�̰���ϴ�.");
				System.out.println("��ǻ��:����, ���:��");
				score++;
			}
			System.out.println("��������:" + score + "       " + "���������" + life);
			if (life == 0)
				break;
		}
		sc.close();
	}
}
