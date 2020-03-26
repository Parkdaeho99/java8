package java8;

public class Day0903 {
	public static void main(String args[]) {
		/*for(int i=1; i<=25; i++) { //1부터 25까지 5칸 5줄로 출력
			System.out.print(i);
			System.out.print(" ");
			if(i<=10)
				System.out.print(" ");
			if(i%5==0)
				System.out.println();
		}
		System.out.println("---------------------------------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=4; j++) {
				System.out.print(i*5+j+1 + "\t");
			}
			System.out.println();
		}*/
		/*
		int a = 12345678;
		//%10d -> 십진수로 10자리 출력
		//- 붙이면 좌측정렬
		System.out.printf("%d",a);
		System.out.printf("%3d",a);*/
		
		/* 01 02 03 04 05
		 * 10 09 08 07 06
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25
		 */
		/*for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				if( ((i+1)%2) != 0)
					System.out.print(i*5+j+"\t");
				else
					for(int k=(i+1)*5; k>0; k--)
						System.out.print(k+"\t");
			}
			System.out.println();
		}*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println("@");
		}
	}
}
