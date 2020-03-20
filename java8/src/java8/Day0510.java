package java8;

import java.util.Scanner;

public class Day0510 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("가위, 바위, 보 중 하나를 선택하세요 (가위=a, 바위=b, 보=c): ");
		Scanner sc = new Scanner(System.in);
		String m_hand = sc.next();
		String c_hand = "";
		
		int temp = (int)(Math.random() * 3);

		if(temp == 0) {
			c_hand = "a";
		}else if(temp == 1) {
			c_hand = "b";
		}else {
			c_hand = "c";
		}
		
		System.out.println(m_hand + c_hand);
		/*m_hand = "a";
		c_hand = "b";*/
		System.out.println(m_hand);System.out.println(c_hand);
		/* m_hand=="a" && c_hand=="c" 이렇기 비교하면,
		 * m_hand랑 c_hand가 기본자료형이 아니기 때문에
		 * (String은 기본 자료형이 아니다)
		 * m_hand랑 c_hand는 각각 값을 바로 가지지 않고,
		 * 값이 저장된 주소를 가르킨다.
		 * 그래서 m_hand=="a"는 m_hand에 들어있는 값이랑 "a"의 주소가 같냐?
		 * 라고 묻는 것임.
		 * 값과 값을 비교해야 하기 때문에 equals를 써준다.*/
		if(m_hand.equals("a") && c_hand.equals("a")) {
			System.out.println("비겼습니다.");
			System.out.println("컴퓨터:가위, 사람:가위");
		}
		if(m_hand.equals("a") && c_hand.equals("b")) {
			System.out.println("졌습니다.");
			System.out.println("컴퓨터:바위, 사람:가위");
		}
		if(m_hand=="a" && c_hand=="c") {
			System.out.println("이겼습니다.");
			System.out.println("컴퓨터:보, 사람:가위");/////////
		}
		if(m_hand=="b" && c_hand=="b") {
			System.out.println("비겼습니다.");
			System.out.println("컴퓨터:바위, 사람:바위");
		}
		if(m_hand=="b" && c_hand=="c") {
			System.out.println("졌습니다.");
			System.out.println("컴퓨터:보, 사람:바위");
		}
		if(m_hand=="b" && c_hand=="a") {///////
			System.out.println("이겼습니다.");
			System.out.println("컴퓨터:가위, 사람:바위");
		}
		if(m_hand=="c" && c_hand=="c") {
			System.out.println("비겼습니다.");
			System.out.println("컴퓨터:보, 사람:보");
		}
		if(m_hand=="c" && c_hand=="a") {
			System.out.println("졌습니다.");
			System.out.println("컴퓨터:가위, 사람:보");
		}
		if(m_hand=="c" && c_hand=="b") {/////////
			System.out.println("이겼습니다.");
			System.out.println("컴퓨터:바위, 사람:보");
		}

		sc.close();
	}

}
