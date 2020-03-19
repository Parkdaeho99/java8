package java8;

public class Day0506 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("주사위 게임 시작");
		int dice = ((int)(Math.random() * 6)) + 1;
		// Math.random() : 0이상 1미만
		// Math.random() * 6 : 1미만의 수에 6을 곱하면 커봤자 5.xxxxx
		// (int)(Math.random * 6) : 0~5
		// ((int)(Math.random() * 6)) + 1; : 1~6
		System.out.println("주사위를 던집니다");
		
		switch(dice) {
		case 1:
			System.out.println("주사위의 눈금은 1");
			break;
		case 2:
			System.out.println("주사위의 눈금은 2");
			break;
		case 3:
			System.out.println("주사위의 눈금은 3");
			break;
		case 4:
			System.out.println("주사위의 눈금은 4");
			break;
		case 5:
			System.out.println("주사위의 눈금은 5");
			break;
		default:
			System.out.println("주사위의 눈금은 6");
		}
		System.out.println("게임 종료");
	}

}
