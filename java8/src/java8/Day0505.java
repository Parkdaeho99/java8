package java8;

public class Day0505 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�ֻ��� ���� ����");
		int dice = ((int)(Math.random() * 6)) + 1;
		// Math.random() : 0�̻� 1�̸�
		// Math.random() * 6 : 1�̸��� ���� 6�� ���ϸ� Ŀ���� 5.xxxxx
		// (int)(Math.random * 6) : 0~5
		// ((int)(Math.random() * 6)) + 1; : 1~6
		System.out.println("�ֻ����� �����ϴ�");
		
		if(dice == 1) {
			System.out.println("�ֻ����� ������ 1");
		} else if(dice == 2) {
			System.out.println("�ֻ����� ������ 2");
		} else if(dice == 3) {
			System.out.println("�ֻ����� ������ 3");
		} else if(dice == 4) {
			System.out.println("�ֻ����� ������ 4");
		} else if(dice == 5) {
			System.out.println("�ֻ����� ������ 5");
		} else {
			System.out.println("�ֻ����� ������ 6");
		}
		System.out.println("���� ����");
	}

}
