package day12;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Singleton s1;
		//s1 = new Singleton(); //private ������ �ܺο��� ������ ȣ�� �Ұ�
		s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//s1�� �̱����� ����Ű�� s2�� �̱����� ����Ų��. = �ּҰ� ����
		//�ܺ�ȣ�� �Ұ����̶� static���� ������ getInstance�� ���� ȣ��
		
		if(s1 == s2) {
			System.out.println("���� ��ü");
		} else
			System.out.println("�ٸ� ��ü");
		
		Member m1 = new Member("ȫ�浿", "hong");
		Member m2 = new Member("ȫ�浿", "hong");
		if(m1 == m2) {
			System.out.println("���� ��ü");
		} else
			System.out.println("�ٸ� ��ü");
		
		
	}

}
