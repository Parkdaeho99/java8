package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEST {

	public static void main(String[] args) throws IOException {
		// TODO 자동 생성된 메소드 스텁
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(br.read());*/
		
		/*InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println(isr.read());*/
		/*int i = 1;
		int j = 1;
	
		int l= 10;
		int m= 500;
		if( 1 == 1 ) {
			System.out.println(System.identityHashCode(i));
			System.out.println(System.identityHashCode(j));
			System.out.println(System.identityHashCode(1));
			
			System.out.println(System.identityHashCode(l));
			System.out.println(System.identityHashCode(l));
			System.out.println(System.identityHashCode(m));
			System.out.println("ㅇㅇ");
		}
		System.out.println("ㄴㄴ");*/
		String i="1",j="1"; //리터럴
		if(i==j) { //리터럴 때문에 i랑 j가 같은 공간을 가르킴
			System.out.println(System.identityHashCode(i));
			System.out.println(System.identityHashCode(j));
			System.out.println("ㅇㅇ");
		}
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(j));
		System.out.println("ㄴㄴ");
	}

}
