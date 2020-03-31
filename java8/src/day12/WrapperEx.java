package day12;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int number = 10; //기본형->객체가 아니다.
		Integer iBox = new Integer(number);
		//박싱1 : 기본형을 객체로 다루고 싶다 -> Wrapper
		Integer iBox2 = Integer.valueOf(number);
		//박싱2 : 기본형을 객체로 다루고 싶다 -> Wrapper
		
		Integer iBox3 = 3; //자동 박싱 언박싱
				
		number = iBox.intValue(); 
		//언박싱 : 객체가된 기본형을 다시 기본형으로
		
	}

}
