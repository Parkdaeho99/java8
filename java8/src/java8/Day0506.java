package java8;

public class Day0506 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�ֻ��� ���� ����");
		int dice = ((int)(Math.random() * 6)) + 1;
		// Math.random() : 0�̻� 1�̸�
		// Math.random() * 6 : 1�̸��� ���� 6�� ���ϸ� Ŀ���� 5.xxxxx
		// (int)(Math.random * 6) : 0~5
		// ((int)(Math.random() * 6)) + 1; : 1~6
		System.out.println("�ֻ����� �����ϴ�");
		
		switch(dice) {
		case 1:
			System.out.println("�ֻ����� ������ 1");
			break;
		case 2:
			System.out.println("�ֻ����� ������ 2");
			break;
		case 3:
			System.out.println("�ֻ����� ������ 3");
			break;
		case 4:
			System.out.println("�ֻ����� ������ 4");
			break;
		case 5:
			System.out.println("�ֻ����� ������ 5");
			break;
		default:
			System.out.println("�ֻ����� ������ 6");
		}
		System.out.println("���� ����");
	}

}
