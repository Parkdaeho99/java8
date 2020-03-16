package java8;

public class Day0309 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int daegu = 200_0000;
		int global = 100_0000;
		
		String str = (daegu >= global) ? ("광역시") : ("시");
		
		System.out.println(str);
		// 식1 ? 식2 : 식3 //참이면 식2 거짓이면 식3
	}

}
