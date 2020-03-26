package java8;

public class Day0801 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/*for(int i=1;i!=101;i++) {
			System.out.println(i);
		}*/
		/*int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);*/
		int res = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0)
				res = res + i;
			else
				res = res - i;
		}
		System.out.println(res);
	}

}
