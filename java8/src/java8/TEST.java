package java8;

import java.io.IOException;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) throws IOException {
		// int i;
		/*
		 * for(i=1;i<=10;i++) { if(i==2) break; System.out.println(i); }
		 */
		// TODO �ڵ� ������ �޼ҵ� ����
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String a = br.readLine(); String b = br.readLine(); String c = br.readLine();
		 * System.out.println(a); System.out.println(b); System.out.println(c);
		 * System.out.println(br.read());
		 */

		/*
		 * InputStreamReader isr = new InputStreamReader(System.in);
		 * System.out.println(isr.read());
		 */
		/*
		 * int i = 1; int j = 1;
		 * 
		 * int l= 10; int m= 500; if( 1 == 1 ) {
		 * System.out.println(System.identityHashCode(i));
		 * System.out.println(System.identityHashCode(j));
		 * System.out.println(System.identityHashCode(1));
		 * 
		 * System.out.println(System.identityHashCode(l));
		 * System.out.println(System.identityHashCode(l));
		 * System.out.println(System.identityHashCode(m)); System.out.println("����"); }
		 * System.out.println("����");
		 */
		/*
		 * String i="1",j="1"; //���ͷ� if(i==j) { //���ͷ� ������ i�� j�� ���� ������ ����Ŵ
		 * System.out.println(System.identityHashCode(i));
		 * System.out.println(System.identityHashCode(j)); System.out.println("����"); }
		 * System.out.println(System.identityHashCode(i));
		 * System.out.println(System.identityHashCode(j)); System.out.println("����");
		 */
		int i, j, k;

		System.out.print("�� �� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		// 6���̸�
		for (i = 0; i < line; i++) {
			for (j = 0; j <= line - 2 - i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		sc.close();
	}

}
