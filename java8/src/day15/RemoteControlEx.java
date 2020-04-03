package day15;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl.changeBattery();
		
		// TODO 자동 생성된 메소드 스텁
		Tv tv = new Tv();
		Audio audio = new Audio();
		RemoteControl rc; //인터페이스는 객체화 못하니 생성자도 없다. 변수 선언은 가능
		rc = tv;
		//자식객체가 부모객체에 들어갈 수 있듯이,
		//구현객체가 인터페이스에 들어가기도 가능
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
			//익명구현객체
			//클래스 파일을 따로 만들지 않아도 됨
			//만약 밑에서 rc에 rc = new Tv()처럼 다른 객체를 넣으면 바뀌어 버리니 일회용임
			@Override
			public void turnOn() {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("보일러를 켭니다.");
				
			}
			@Override
			public void turnOff() {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("보일러를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("온도의 단계를"+volume+"단계로 변경합니다.");
			}
		}; //변수를 정의하는 것이기 때문에 세미콜론 필수
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
		// 부모클래스, 부모인터페이스, 부모객체에 
		// 자식클래스, 자식인터페이스, 자식객체가 들어갈수있는게 진짜 중요
	}

}
