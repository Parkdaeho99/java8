package java8;

import java.util.Scanner;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A' + '1';
		System.out.println(ch);
		str = "A" + "1";
		System.out.println(str);
		String str2 = "10";
		
		int num3 = 10;
		int num4 = 20;
		System.out.println(num3 + (num4 + ""));
		String str3 = String.valueOf(num3);
		
		String str4 = "100";
		System.out.println(str4 + 100);
		
		int num5 = Integer.valueOf(100);
		System.out.println(num5+100);
		
		int num6 = Integer.parseInt("100");
		System.out.println(num6 + 100);
		     
	}

}
