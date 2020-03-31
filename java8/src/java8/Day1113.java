package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1113 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/*가위 바위 보*/
		System.out.print("1. 가위, 2. 바위, 3. 보, 4. 종료 >>"+"\t");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int score = 0;
		int life = 3;
		
		while(true) {
			int user = sc.nextInt();
			int com = rd.nextInt(3)+1; //1,2,3
			if(user==4 || life==0) {
				System.out.println("종료");
				break;
			}
			
			if( user==com ) {
				score = score + 50;
				System.out.print("비김"+"\t");
			}else if( (user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2) ) {
				score = score + 100;
				System.out.print("유저 승"+"\t");
			}else if( (user==1&&com==2) || (user==2&&com==3) || (user==3&&com==1) ) {
				life--;
				System.out.print("컴퓨터 승"+"\t");
			}else
				System.out.println("잘못된 접근");
		}
		sc.close();
		System.out.println("점수>"+score+"\t"+"라이프"+life);
	}

}
