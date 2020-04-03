package day16;

import java.io.File;
import java.util.Scanner;

public class Trywithresources2 {
	public void getData(String file) {
		try (Scanner sc = new Scanner(new File(file)); Scanner sc2 = new Scanner(System.in);) {
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("예외발생");
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		} finally {
			
			
		}
	}

	public static void main(String[] args) {
		Trywithresources2 tw = new Trywithresources2();
		tw.getData("test.txt");
	}
}
