package java8;

public class Day0208 {

	public static void main(String[] args) {
		int dice = 0;
		
		double dice1 = Math.random();
		double dice2 = dice1 * 6;
		System.out.println(dice2);
		System.out.println(dice1);
		
		/* Math.random()�� 0~1 �̸����� ������ �ű⿡ 6�� ���ϸ�
		 * �߳��ͺ��� 5.99999999
		 * ��, �����δ� 0~5������ ���´�
		 * 1~6���� ������ �ϴ� �� �����̴� +1�� ���ش�.
		 */
	}

}
