package java8;

import java.util.Scanner;

public class Ch0302 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1 > num2)
			System.out.println("ū��:"+num1+"\n"+"������:"+num2);
		else
			System.out.println("ū��:"+num2+"\n"+"������:"+num1);
		sc.close();
		
	}

}
