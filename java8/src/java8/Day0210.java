package java8;

public class Day0210 {

	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		System.out.println("��� �� ���� 10�������� ������");
		System.out.println("7������ �Ծ����ϴ�.");
		System.out.println("���� ������ �� �����ϱ��?");
		double result = apple - unit * 7;
		System.out.println(result);
		/*�Ǽ��� ��Ȯ�ϰ� �������� �ʴ´�. 
		�׷��Ƿ� ������ ���� ��� �� �Ǽ��� ǥ��*/
		int apple2 = 1;
		double unit2 = 1;
		double result2 = (apple2 * 10 - unit2 * 7) / 10;
		System.out.println(result2);
	}

}
