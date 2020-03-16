package java8;

import java.util.Scanner;

public class ScanEx4 {

	public static void main(String[] args) {
		Scanner 문자입력기= new Scanner(System.in);
		System.out.println("두 명의 이름을 입력해 주세요: ");
		double text = 문자입력기.nextDouble();
		System.out.println(text);
		문자입력기.close();
	}

}
