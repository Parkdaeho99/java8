package java8;

import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요:");
		String name = sc.nextLine();
		System.out.print(name + "님의 오늘의 행운은 ");
		System.out.println((int)(Math.random()*51)+50 + "%입니다");
		sc.close();
	}

}
