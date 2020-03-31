package day12;

public class MemberServiceEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		MemberService ms = new MemberService();
		Member hong = new Member("홍길동", "hong");
		hong.password = "12345";
		hong.age = 30;
		if (ms.login(hong.id, hong.password) == true) {
			System.out.println("로그인 하였습니다.");
			ms.logout(hong.id);
		} else
			System.out.println("로그인 실패");

		System.out.println();
		
		Member lee = new Member("이연희", "lee");
		hong.password = "12345";
		hong.age = 20;
		if (ms.login(lee.id, lee.password) == true) {
			System.out.println("로그인 하였습니다.");
			ms.logout(lee.id);
		} else
			System.out.println("로그인 실패");
	}

}
