package day15;

public class IpTV implements RemoteControl, Internet{ 
	// ���߱��� ����
	// extends RemoteControl, Internetó�� ���߻���� �Ұ���
	// �������̽��� ���߻���� ���߻�� ����
	// interface �����������̽��� extends �����������̽�1, �����������̽�2
	private int volume;
	
	@Override
	public void searchWeb() {
		System.out.println("���ͳ��� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("IpTV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("IpTV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(this.volume+"���� ������ �����մϴ�.");
	}
	
}
