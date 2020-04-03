package day15;

public class IpTV implements RemoteControl, Internet{ 
	// 다중구현 가능
	// extends RemoteControl, Internet처럼 다중상속은 불가능
	// 인터페이스의 다중상속은 다중상속 가능
	// interface 하위인터페이스명 extends 상위인터페이스1, 상위인터페이스2
	private int volume;
	
	@Override
	public void searchWeb() {
		System.out.println("인터넷을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("IpTV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("IpTV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(this.volume+"으로 볼륨을 변경합니다.");
	}
	
}
