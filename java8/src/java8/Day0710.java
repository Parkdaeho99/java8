package java8;

public class Day0710 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
			if((i%3)==0) {
				System.out.print("ping");
			}
			if((i%5)==0) {
				System.out.print("pong");
			}
			System.out.println();
		}
	}

}
