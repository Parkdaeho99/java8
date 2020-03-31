package java8;

import java.util.Scanner;

public class Gimbob {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("--------------------------------------------------------------------");
		System.out.println("메뉴"+"\t\t\t\t"+"가격(원)"+"\t\t"+"주문");
		System.out.println("김밥 1줄"+"\t\t\t"+"2,000원"+"\t\t\t"+"1");
		System.out.println("떡볶이 1인분"+"\t\t\t"+"2,000원"+"\t\t\t"+"1");
		System.out.println("오뎅 1인분"+"\t\t\t"+"500원"+"\t\t\t"+"4");
		System.out.println("순대 1인분"+"\t\t\t"+"2,000원"+"\t\t\t"+"1");
		System.out.println("--------------------------------------------------------------------");
		
		
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("주문하기> ");
			input = sc.nextLine();
			if(input.equals("김밥")) {
				System.out.println("김밥 선택하셨습니다.");
			}
				
				
			System.out.print("계속 주문하시겠습니까? > ");
			
			
			if(input.equals("n") || input.equals("no") || input.equals("아니요") || input == "아니오" || input == "아뇨")
				break;
				
		}
		
		
		
		
	}

}
