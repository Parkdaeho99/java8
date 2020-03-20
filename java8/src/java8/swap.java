package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swap {

	public static void main(String[] args) throws IOException {
		// TODO 자동 생성된 메소드 스텁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("N 입력하세요.");
		String n = br.readLine();
		System.out.print("M 입력하세요.");
		String m = br.readLine();
		System.out.println("변경 전 N과 M은 : " + Integer.parseInt(n) + "  " + Integer.parseInt(m));
		
		String temp = n;
		n = m;
		m = temp; 
		System.out.println("변경 후 N과 M은 : " + Integer.parseInt(n) + "  " + Integer.parseInt(m));
		br.close();
				
	}

}
