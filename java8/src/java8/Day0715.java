package java8;

import java.util.Scanner;

public class Day0715 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		/*for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+i*j + "\t");
			}
			System.out.println();
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("��� :");
		int num = sc.nextInt();
		for(int i = 1; i<=9; i++) {
			System.out.println(num +"*"+ i + "=" + num*i);
		}
		sc.close();
		
	}

}
