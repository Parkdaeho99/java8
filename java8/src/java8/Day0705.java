package java8;

public class Day0705 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int sum=0;//408
		for(int i =1; i<=50; i++) {
			if( (i%3)==0 )
				sum = sum + i;
		}
		System.out.println(sum);
	}

}
