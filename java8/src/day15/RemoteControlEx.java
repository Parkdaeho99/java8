package day15;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl.changeBattery();
		
		// TODO �ڵ� ������ �޼ҵ� ����
		Tv tv = new Tv();
		Audio audio = new Audio();
		RemoteControl rc; //�������̽��� ��üȭ ���ϴ� �����ڵ� ����. ���� ������ ����
		rc = tv;
		//�ڽİ�ü�� �θ�ü�� �� �� �ֵ���,
		//������ü�� �������̽��� ���⵵ ����
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		System.out.println();
		
		rc = audio;
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new RemoteControl() {
			//�͸�����ü
			//Ŭ���� ������ ���� ������ �ʾƵ� ��
			//���� �ؿ��� rc�� rc = new Tv()ó�� �ٸ� ��ü�� ������ �ٲ�� ������ ��ȸ����
			@Override
			public void turnOn() {
				// TODO �ڵ� ������ �޼ҵ� ����
				System.out.println("���Ϸ��� �մϴ�.");
				
			}
			@Override
			public void turnOff() {
				// TODO �ڵ� ������ �޼ҵ� ����
				System.out.println("���Ϸ��� ���ϴ�.");
			}

			@Override
			public void setVolume(int volume) {
				// TODO �ڵ� ������ �޼ҵ� ����
				System.out.println("�µ��� �ܰ踦"+volume+"�ܰ�� �����մϴ�.");
			}
		}; //������ �����ϴ� ���̱� ������ �����ݷ� �ʼ�
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new IpTV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		// �θ�Ŭ����, �θ��������̽�, �θ�ü�� 
		// �ڽ�Ŭ����, �ڽ��������̽�, �ڽİ�ü�� �����ִ°� ��¥ �߿�
	}

}
