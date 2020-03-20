package java8;

import java.util.Scanner;

public class Day0509 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.println("a:아메리카노, c:카푸치노, l:카페라떼, m:카페모카");
		System.out.print("하나를 입력하세요: ");
		String choice = sc.next();
		
		switch(choice) {
		case"a":
		case"A":
			System.out.println("아메리카노 나왔습니다.");
			break;
		case"c":
		case"C":
			System.out.println("카푸치노 나왔습니다.");
			break;
		case"l":
		case"L":
			System.out.println("카페라떼 나왔습니다.");
			break;
		default:
			System.out.println("카페모카 나왔습니다.");
		}
		sc.close();
	}

}
