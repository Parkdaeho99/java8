package java8;

import java.util.Scanner;

public class Chapter03 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("윤년 판별 프로그램");
		System.out.print("윤년을 판별할 년도 입력! : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); //1804
		int year1 = year%4; // 0
		int year2 = year%100; // 4
		int year3 = year%400; // 204
		
		/*if (year1 == 0) {
			if (year2 == 0) {
				System.out.println("평년");
				System.exit(0);
			}
			System.out.println("평년");
		}
		
		if (year1==0 && year2%100==0) {
			if (year3==0) {
				System.out.println("윤년");
			}
			System.out.println("평년");
		}*/
		
		if (year1 == 0 && year2 == 0 && year3 == 0)
			System.out.println("윤년");
		else if(year1 == 0 && year2 == 0 && year3 != 0)
			System.out.println("평년");
		else if(year1 == 0)
			System.out.println("윤년");
		else
			System.out.println("평년");
		sc.close();
	}

}
