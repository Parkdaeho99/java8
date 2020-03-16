package java8;

import java.util.Scanner;

public class ScanEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 명의 이름을 입력해 주세요: ");
		String text = sc.nextLine();
		System.out.println(text);
		sc.close();
	}

}
