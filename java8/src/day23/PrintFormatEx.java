package day23;

import java.util.Date;

public class PrintFormatEx {
	public static void main(String[] args) {
		int num = 10;
		double log = Math.log(num);
		System.out.println(Math.log(10));
		System.out.format("log(%d):%+10.6f %n", num, log);
		// %+ ���
		// %+10.6 -> �� 10�ڸ��̰�, +�� ���ڸ�, �Ҽ����� ���ڸ�, �Ҽ��� ���� 6�ڸ�, ���� 2�ڸ��� ����
		Date today = new Date();
		
		System.out.printf("���� ��¥ : %tY�� %tm�� %td�� \n", today,today,today);
		//%tY ������year
		System.out.printf("���� ��¥ : %1$tY�� %1$tm�� %1$td�� \n", today);
		System.out.printf("���� ��¥ : %1$tY�� %1$tm�� %1$td�� \n");
	}
}
