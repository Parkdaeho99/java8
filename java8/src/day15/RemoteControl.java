package day15;

public abstract interface RemoteControl { 
	//�������̽��� ������ִ� �뵵�� ���̴�.
	//�׷��� �⺻�� public static final(�������)�̴�.
	int MAX_VOLUME = 10; //public static final �Ⱥٿ��� �������
	int MIN_VOLUME = 0;
	
	//abstract �ٿ��� ��������� �߻�Ŭ����, �߻�޼ҵ��ε�,
	//�������̽��� �⺻�� abstract��
	void turnOn(); //abstract �Ⱥٿ��� �߻�޼ҵ�
	void turnOff();//����
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		//�������̽����� ���ǰ� ������ default �޼ҵ�
		if(mute) System.out.println("���Ұ� ���·� �����մϴ�.");
		else System.out.println("���Ұ� ���¸� �����մϴ�.");
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
