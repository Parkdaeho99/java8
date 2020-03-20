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
		/* String은 기본 자료형이 아니기 때문에,
		 * 값 자체를 가지지 않고, 값을 가진 공간을 참조한다.
		 * 그러므로 == 연산자로 비교하면 안되고,
		 * equals를 써서 비교해야 한다.
		 */
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
