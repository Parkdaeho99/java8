package java8;

import java.util.Scanner;

public class Day0503 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 점수 입력: ");
		int score = sc.nextInt();
		String pass ="";
		if(score >= 90) pass = "A학점";
		else if ( score >= 80) pass = "B학점";
		else if ( score >= 70) pass = "C학점";
		else if ( score >= 60) pass = "D학점";
		else pass = "F학점";
		
		System.out.println("시험 성적은" + pass + "입니다");
		sc.close();
	}

}
