package day23;

import java.io.File;

public class FileDirOutput {
	static String dir;

	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.out.println("main 매개변수를 입력하세요");
//			System.exit(1);
//		}
		dir = "c:/java";
		File myFile = new File(dir);
		String[] flist = myFile.list(); //myFile이 가리키는 경로에 있는 파일들의 리스트?
		System.out.println("검색 디렉토리 > " + dir);
		System.out.println("----------------------------");
		for (int i = 0; i < flist.length; i++) {
			File cfile = new File(dir + "/" + flist[i]);
			if (cfile.isDirectory()) {
				System.out.println("디렉토리 :" + flist[i]);
			} else {
				System.out.println("파일: " + flist[i]);
			}
		}
	}
}
