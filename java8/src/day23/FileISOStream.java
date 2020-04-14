package day23;

import java.io.FileReader;
import java.io.IOException;

public class FileISOStream {
	static String tfile;
	public static void main(String[] args) {
		int cnt;
		char chr;
		if(args.length != 1) {
			System.out.println("매개변수로 텍스트파일 이름을 입력하세요");
			System.exit(1);
		}
		tfile = args[0];
		
		try {
			FileReader fr = new FileReader(tfile);
			System.out.println("파일이름 : "+tfile);
			System.out.println("---------------------------");
			while( (cnt = fr.read()) != -1 ) {
				chr=(char)cnt;
				System.out.println(chr);
			}
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
}
