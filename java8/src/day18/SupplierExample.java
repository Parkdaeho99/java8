package day18;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> { // �ƹ��͵� ���ְ�
			int num = (int)(Math.random() * 6 + 1);
			return num; //num�� ���Ϲ޴´�.
		};
		int num = intSupplier.getAsInt(); //���ϰ��� �����´�
		System.out.println("���� ��: " + num);
	}
	
}
