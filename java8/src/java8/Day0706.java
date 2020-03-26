package java8;

public class Day0706 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int sum=1;
		for(int i = 1; i<=10; i++) {
			//1*2*3*4*5*6*7*8*9*10
			sum = sum * i;
		}
		
		System.out.println(sum);
	}
	//sum -> 1*1 -> 1*2=2 -> 2*3=6 -> 6*???  

}
