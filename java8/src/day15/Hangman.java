package day15;
import java.util.Scanner;

public class Hangman {
	/* 6������ �������Ѵ� */
	private String hiddenString;
	private StringBuffer inputString; //����� �Է� ���ĺ�
	private StringBuffer outputString;
	int remainder; // �������ڼ�
	private int failed; // ����Ƚ��?
	int index;
	StringBuffer sb;
	Scanner sc;

	Hangman() {
		hiddenString = "hello";
		inputString = new StringBuffer();
		sb = new StringBuffer("_____");
		sc = new Scanner(System.in);
		failed = 0;
	}

	public void playGame() {
		for (int i = 0; i < 6; i++) {
			String input;
			System.out.print("���ĺ��� �Է��ϼ��� >");
			input = sc.next(); //�Է�
			if( (inputString.indexOf(input)) != -1 ) { //�Ȱ����� �� �ԷµǾ�����
				System.out.println("�ߺ��Դϴ�. �ٸ� ���ĺ��� �Է��ϼ���.");
				i--;
				System.out.println(sb);
				continue;
			} else {
				inputString.append(input); //�Է��Ѱ� ����
			}
			index = hiddenString.indexOf(input); //�Է��Ѱ� �ִ��� ã�ƺ���
			if (index == -1) { //������
				failed++;
				System.out.println("�߰����� ���߽��ϴ�.");
			} else {
				inputString.append(input.charAt(0)); // �Է��ߴ��͵� ����
				sb.setCharAt(index, input.charAt(0));
				System.out.println(index + "�߰�" + sb);
			}
		}
	}
}
