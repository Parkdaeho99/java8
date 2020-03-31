package day12;

public class CompareToEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String a = "aaa"; // a = 97
		String b = "Acc"; // A = 65 
		int res = a.compareTo(b); // 97 - 65 = 32
		// a와 b를 비교해서 정렬하기 가능
		System.out.println(res);
		
		String c = "Java Programming Very Good";
		String d = "java Programming";
		boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
		//대소문자 구분하여
		boolean compare2 = c.regionMatches(true, 0, d, 0, 4);
		boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
	}

}
