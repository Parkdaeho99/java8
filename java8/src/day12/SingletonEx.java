package day12;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Singleton s1;
		//s1 = new Singleton(); //private 때문에 외부에서 생성자 호출 불가
		s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//s1도 싱글톤을 가르키고 s2도 싱글톤을 가르킨다. = 주소가 같다
		//외부호출 불가능이라서 static으로 지정한 getInstance를 통해 호출
		
		if(s1 == s2) {
			System.out.println("동일 객체");
		} else
			System.out.println("다른 객체");
		
		Member m1 = new Member("홍길동", "hong");
		Member m2 = new Member("홍길동", "hong");
		if(m1 == m2) {
			System.out.println("동일 객체");
		} else
			System.out.println("다른 객체");
		
		
	}

}
