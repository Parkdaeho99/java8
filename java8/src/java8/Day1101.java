package java8;

public class Day1101 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int num[] = new int[100];
		int sum = 0;
		for(int i=0; i<100; i++) {
			System.out.print(num[i]);
		}
		for(int i=0; i<100; i++) {
			num[i] = i+1;
			sum = sum + num[i];
		}
		System.out.println();
		for(int i=0; i<100; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		System.out.println(sum);
		
	}

}
