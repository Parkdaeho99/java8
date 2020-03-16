package java8;

public class Day0208 {

	public static void main(String[] args) {
		int dice = 0;
		
		double dice1 = Math.random();
		double dice2 = dice1 * 6;
		System.out.println(dice2);
		System.out.println(dice1);
		
		/* Math.random()은 0~1 미만값이 나오고 거기에 6을 곱하면
		 * 잘나와봤자 5.99999999
		 * 즉, 정수로는 0~5까지만 나온다
		 * 1~6까지 나오게 하는 게 목적이니 +1을 해준다.
		 */
	}

}
