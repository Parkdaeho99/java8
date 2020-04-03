package day15;

public abstract interface RemoteControl { 
	//인터페이스는 상속해주는 용도일 뿐이다.
	//그래서 기본이 public static final(전역상수)이다.
	int MAX_VOLUME = 10; //public static final 안붙여도 전역상수
	int MIN_VOLUME = 0;
	
	//abstract 붙여야 상속전용인 추상클래스, 추상메소드인데,
	//인터페이스는 기본이 abstract임
	void turnOn(); //abstract 안붙여도 추상메소드
	void turnOff();//선언만
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		//인터페이스에서 정의가 가능한 default 메소드
		if(mute) System.out.println("음소거 상태로 설정합니다.");
		else System.out.println("음소거 상태를 해제합니다.");
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
