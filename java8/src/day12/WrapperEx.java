package day12;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int number = 10; //�⺻��->��ü�� �ƴϴ�.
		Integer iBox = new Integer(number);
		//�ڽ�1 : �⺻���� ��ü�� �ٷ�� �ʹ� -> Wrapper
		Integer iBox2 = Integer.valueOf(number);
		//�ڽ�2 : �⺻���� ��ü�� �ٷ�� �ʹ� -> Wrapper
		
		Integer iBox3 = 3; //�ڵ� �ڽ� ��ڽ�
				
		number = iBox.intValue(); 
		//��ڽ� : ��ü���� �⺻���� �ٽ� �⺻������
		
	}

}
