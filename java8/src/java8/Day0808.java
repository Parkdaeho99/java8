package java8;

import java.util.Scanner;

public class Day0808 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		int res1 = 0;
		int res2 = 0;
		
		for(int i=1; i<=Integer.MAX_VALUE; i++) {
			if(i%num1 == 0 && i%num2 == 0) {
				res1 = i;
				break;
			}
		}
		res2 = num1 * num2 / res1;
		System.out.println("최소 공배수"+res1 +"최대공약수"+res2);
		
		
	}
}
