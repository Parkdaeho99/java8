package day15;

public class Tv implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("TV�� ���ϴ�.");
		
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
		System.out.println("TV�� ������ "+volume+"���� �����մϴ�.");
	}
	
	@Override
	public void setMute(boolean mute) {
		// TODO �ڵ� ������ �޼ҵ� ����
		if(mute) 
			System.out.println("TV�� ���Ұ� ���·� �����մϴ�.");
		else 
			System.out.println("TV�� ���Ұ� ���¸� �����մϴ�.");
	}
	
}
