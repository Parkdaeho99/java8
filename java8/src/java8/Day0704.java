package java8;

public class Day0704 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			if((i%2)==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
