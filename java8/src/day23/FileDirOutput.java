package day23;

import java.io.File;

public class FileDirOutput {
	static String dir;

	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.out.println("main �Ű������� �Է��ϼ���");
//			System.exit(1);
//		}
		dir = "c:/java";
		File myFile = new File(dir);
		String[] flist = myFile.list(); //myFile�� ����Ű�� ��ο� �ִ� ���ϵ��� ����Ʈ?
		System.out.println("�˻� ���丮 > " + dir);
		System.out.println("----------------------------");
		for (int i = 0; i < flist.length; i++) {
			File cfile = new File(dir + "/" + flist[i]);
			if (cfile.isDirectory()) {
				System.out.println("���丮 :" + flist[i]);
			} else {
				System.out.println("����: " + flist[i]);
			}
		}
	}
}
