package day12;

import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 순으로 3개의 정수 입력 >>");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		Grade me = new Grade(kor,eng,mat);
		System.out.println("평균: " + me.avg());
		
		sc.close();
	}

}
