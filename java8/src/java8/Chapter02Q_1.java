package java8;

import java.util.Scanner;

public class Chapter02Q_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("이름, 학번, 토플점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		System.out.println("내 이름은 : "+ a +"입니다");
		System.out.println("내 학번은 : "+ Integer.parseInt(b) +"입니다");
		System.out.println("내 토플점수는 : "+ Integer.parseInt(c) +"입니다");
		sc.close();
	}

}
