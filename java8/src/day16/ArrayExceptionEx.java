package day16;

public class ArrayExceptionEx {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		exceptionTest();
	}

	static void exceptionTest() {
		int arr[] = new int[3];
		try {
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();
			//�谭�� ���� �߻�
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ���� �Ұ��� �Ǵ� �迭 ���� ���!!!");
		} catch (Exception e) {
			System.out.println("��� ���ܸ� ó��!!!");
			e.printStackTrace();
			//��cattch ���� �� �߻��Ǵ� �������� ���� ���� �߻�
		} finally { //�翹�ܿ� ������� ����Ǵ� ����, ��� �Ǵ� ����
			System.out.println("finally �����Դϴ�.");
		}
	}
}
