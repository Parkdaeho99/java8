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
		System.out.println("�Է� >>������ ����");
		Reader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("�Է��� ����: ");
		String str = br.readLine();
		System.out.println(str);
		System.out.println("��½�Ʈ��: ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("���� ��� ��Ʈ�� ���");
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
�ƽ�Ű
	10        LF ( Line Feed => ���� �ٷ�... )
	13        CR ( Cariage Return => ���� ó�� ĭ����... )
*/


