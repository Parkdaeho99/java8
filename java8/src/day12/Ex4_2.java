package day12;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) throws IOException {
		// TODO 자동 생성된 메소드 스텁
			
		System.out.print("출력할 문자열을 입력하세요: ");
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader inbr = new BufferedReader(isr);
//		String instr = inbr.readLine();
		Scanner sc = new Scanner(System.in);
		String instr = sc.nextLine();
		StringBuffer str = new StringBuffer(instr);
		System.out.println("입력한 문자열 : " + str);
		System.out.println("거꾸로 출력 : " + str.reverse());
		sc.close();
	}

}
