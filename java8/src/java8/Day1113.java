package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1113 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		/*���� ���� ��*/
		System.out.print("1. ����, 2. ����, 3. ��, 4. ���� >>"+"\t");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int score = 0;
		int life = 3;
		
		while(true) {
			int user = sc.nextInt();
			int com = rd.nextInt(3)+1; //1,2,3
			if(user==4 || life==0) {
				System.out.println("����");
				break;
			}
			
			if( user==com ) {
				score = score + 50;
				System.out.print("���"+"\t");
			}else if( (user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2) ) {
				score = score + 100;
				System.out.print("���� ��"+"\t");
			}else if( (user==1&&com==2) || (user==2&&com==3) || (user==3&&com==1) ) {
				life--;
				System.out.print("��ǻ�� ��"+"\t");
			}else
				System.out.println("�߸��� ����");
		}
		sc.close();
		System.out.println("����>"+score+"\t"+"������"+life);
	}

}
