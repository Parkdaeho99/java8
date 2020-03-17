package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {

	public static void main(String[] args) throws IOException {
		// TODO 자동 생성된 메소드 스텁
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// scanner랑 달리 문자만 입력받을 수 있음 그래서 밑에서 parseint
		System.out.println("키보드를 눌러서 문자열을 입력하세요:");
		String str = br.readLine(); // 버퍼에 찬 문자를 읽어옴
		System.out.println(str);
		
		System.out.println("숫자를 입력해 주세요.:");
		String number = br.readLine();
		int num = Integer.parseInt(number);
		System.out.println(num);
		
		br.close();
		isr.close();
	}

}
