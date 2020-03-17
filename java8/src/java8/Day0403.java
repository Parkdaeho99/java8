package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {

	public static void main(String[] args) throws IOException {
		// TODO 자동 생성된 메소드 스텁
		InputStreamReader isr = new InputStreamReader(System.in); 
		//아무리 많이 입력받아봤자 하나씩밖에 꺼내오지못함?
		BufferedReader br = new BufferedReader(isr);
		//그래서 버퍼를 만들어주고 인풋스트림리더로부터 문자를 읽어들임
		int temp = isr.read(); // 하나씩밖에 꺼내오지 못해서 한개씩만 나옴?
		int temp1 = isr.read(); //꺼내진거빼고 다음꺼를 꺼내옴
		System.out.println(temp);
		System.out.println(temp1);
		/*isr이나 br이나 둘다 같은 버퍼를 참조하는듯?*/
		System.out.println(br.readLine()); //하지만 버퍼에는 다 꺼내오기가능
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
