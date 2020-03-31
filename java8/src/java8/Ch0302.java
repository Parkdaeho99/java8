package java8;

import java.util.Scanner;

public class Ch0302 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1 > num2)
			System.out.println("큰값:"+num1+"\n"+"작은값:"+num2);
		else
			System.out.println("큰값:"+num2+"\n"+"작은값:"+num1);
		sc.close();
		
	}

}
