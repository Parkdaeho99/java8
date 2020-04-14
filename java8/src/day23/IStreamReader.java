package day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class IStreamReader {
	public static void main(String[] args) throws IOException {
		int idata = -1;
		System.out.println("입력 >>마지막 엔터");
		Reader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("입력한 문자: ");
		String str = br.readLine();
		System.out.println(str);
		System.out.println("출력스트림: ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("버퍼 출력 스트림 출력");
		bw.flush();
//		try {
//			while (true) {
//				idata = isr.read();
//				System.out.println(idata);
//				if (idata == -1) {
//					break;
//				}
//				System.out.println((char) idata);
//			}
//			
//		} catch (IOException e) {
//			System.out.println(e.toString());
//		}
	}
}
/*
아스키
	10        LF ( Line Feed => 다음 줄로... )
	13        CR ( Cariage Return => 제일 처음 칸으로... )
*/


