package day12;

//���� �� �� �ִ� Ŭ���� private ������ ����.
public class Singleton {
	private static Singleton singleton = new Singleton();
	//���� �� �� �ִ� ��ü private
	//+�ܺο��� ȣ���� �� �ְ� static
	//�޸� �ּ�ȭ�� ���� �Ѱ��� ��ü�� ������ְ� ��ü�� �̸� ����� �д�.
	//�� ��ü�� ��� �����
	
	private Singleton() {
		//�ܺ� ȣ�� ���� private
	}
	
	static Singleton getInstance() {
		//�ܺ� ȣ���� ���� �Լ�
		return singleton;
	}
}
