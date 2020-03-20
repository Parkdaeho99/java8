package java8;

import java.util.Scanner;

public class Day0510 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("가위, 바위, 보 중 하나를 선택하세요 (가위=a, 바위=b, 보=c): ");
		Scanner sc = new Scanner(System.in);
		String m_hand = sc.next(); //리터럴을 쓰지 않아서
		System.out.println(System.identityHashCode("a")); //421
		System.out.println(System.identityHashCode(m_hand)); // 104
		//m_hand는 리터럴을 써서 저장한게 아니라서 새로운 공간생성
		System.out.println(System.identityHashCode("a")); // 421
		//가장 먼저 a가 메모리에 올라간 위치 421주소,
		//고로 이후의 a는 모두 421주소에 있다
		//새롭게 메모리에 올리지 않는 이상에

		String c_hand = "";
		
		int temp = (int)(Math.random() * 3);

		if(temp == 0) {
			c_hand = "a";
			System.out.println(System.identityHashCode(c_hand)); //421
			//c_hand는 리터럴을 썻기 때문에 위에서 쓴 "a"랑 같은 공간이다.
		}else if(temp == 1) {
			c_hand = "b";
		}else {
			c_hand = "c";
		}
		
		System.out.println(m_hand + c_hand);
		/*m_hand = "a";
		c_hand = "b";*/
		/* String은 기본 자료형이 아니고 객체라서
		 * 값 자체를 가지지 않고, 값을 가진 공간을 참조한다.
		 * 그러므로 == 연산자로 비교하면 안되고,
		 * equals를 써서 비교해야 한다.
		 * == 연산자는 양 옆의 값을 비교하는 건데,
		 * 아래 코드에서 m_hand == "a" 부분은
		 * m_hand가 String이기 때문에 값으로 주소값을 가지고 있기 때문에
		 * == 연산자를 사용하면 m_hand의 주소값과 "a"가 같냐고 묻는 것?
		 * 
		 */
		System.out.println(System.identityHashCode("a")); // 421

		if(m_hand.equals("a") && c_hand.equals("a")) {
			System.out.println(System.identityHashCode(m_hand)); // 104
			System.out.println(System.identityHashCode(c_hand)); // 421
			System.out.println(System.identityHashCode("a")); // 421
			System.out.println("비겼습니다.");
			System.out.println("컴퓨터:가위, 사람:가위");
		}
		if(m_hand.equals("a") && c_hand.equals("b")) {
			System.out.println("졌습니다.");
			System.out.println("컴퓨터:바위, 사람:가위");
		}
		if(m_hand=="a" && c_hand=="c") {
			//"a"가 있는 421공간이랑 "c"가 있는 공간이랑 같냐?
			//절대 같을수없다.
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
