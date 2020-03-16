package java8;

import java.util.Scanner;

public class ScanEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 명의 이름을 입력해 주세요: ");
		String text = sc.next();
		System.out.println(text);
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		sc.close();
	}

}
