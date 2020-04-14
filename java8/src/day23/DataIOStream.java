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
		/*dsfile�� ������ �����ϰ� �ű⿡ ���� DataOutputStream���� ����?*/
		/*��������½�Ʈ�� ���? ���Ͼƿ�ǲ��Ʈ���� �׷��� ���Ͼƿ�ǲ��Ʈ���� dsfile��� ���Ͽ� ���*/
		dos.writeChar('c');
		dos.writeInt(897);
		dos.writeDouble(234.6);
		dos.writeByte(34);
		dos.writeBoolean(true);
		dos.flush();
		dos.close();
		System.out.println("������ ���� ����� : dsfile ");
		System.out.println("---------------------------");
		
		DataInputStream dls = new DataInputStream(new FileInputStream("dsfile"));
		System.out.println(dls.readChar());
	}
}
