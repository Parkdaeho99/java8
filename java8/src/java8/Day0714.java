package java8;

public class Day0714 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
/*		int sum=0;
		for(int i = 1; i<=100; i++) {
			if( i%5 == 0 )
				sum += i;
		}
		System.out.println(sum);*/
	/*	for(int i=1; i<=50; i++) {
			if(i%3 == 0)
				System.out.println(i);
		}*/
		int sum=0;
		int cnt=0;
		for(int i=1; i<=50; i++) {
			if(i%3 == 0) {
				sum=sum+i;
				cnt++;
			}
		}
		System.out.println(sum+"    "+cnt);
	}

}
