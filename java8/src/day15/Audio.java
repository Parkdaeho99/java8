package day15;

public class Audio implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("������� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO �ڵ� ������ �޼ҵ� ����
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		this.volume = volume;
		System.out.println("������� ������ "+volume+"���� �����մϴ�.");
	}
}
