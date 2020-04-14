package day23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {
	static String fname;
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dsfile"));
		/*dsfile로 파일을 생성하고 거기에 쓰고 DataOutputStream으로 접근?*/
		/*데이터출력스트림 어디에? 파일아웃풋스트림에 그러면 파일아웃풋스트림이 dsfile라는 파일에 출력*/
		dos.writeChar('c');
		dos.writeInt(897);
		dos.writeDouble(234.6);
		dos.writeByte(34);
		dos.writeBoolean(true);
		dos.flush();
		dos.close();
		System.out.println("데이터 파일 입출력 : dsfile ");
		System.out.println("---------------------------");
		
		DataInputStream dls = new DataInputStream(new FileInputStream("dsfile"));
		System.out.println(dls.readChar());
	}
}
