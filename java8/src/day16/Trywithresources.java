package day16;

import java.io.File;
import java.util.Scanner;

public class Trywithresources {
	public void getData(String file) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("예외발생");
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
	public static void main(String[] args) {
		Trywithresources tw = new Trywithresources();
		tw.getData("test.txt");
	}

}
