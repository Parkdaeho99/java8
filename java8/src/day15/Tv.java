package day15;

public class Tv implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO 자동 생성된 메소드 스텁
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		this.volume = volume;
		System.out.println("TV의 볼륨을 "+volume+"으로 변경합니다.");
	}
	
	@Override
	public void setMute(boolean mute) {
		// TODO 자동 생성된 메소드 스텁
		if(mute) 
			System.out.println("TV를 음소거 상태로 설정합니다.");
		else 
			System.out.println("TV의 음소거 상태를 해제합니다.");
	}
	
}
