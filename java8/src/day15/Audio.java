package day15;

public class Audio implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("오디오를 끕니다.");
		
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
		System.out.println("오디오의 볼륨을 "+volume+"으로 변경합니다.");
	}
}
