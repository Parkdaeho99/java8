package day18;

public class Func2Ex {
	public static void main(String[] args) {
		Func2 func1 = new Func2() { // �͸�����ü
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		System.out.println(func1.method(3, 27));
		
		Func2 func2 = (int x, int y) -> { // ���ٽ� ���1
			int result = x + y;
			return result;
		};
		System.out.println(func2.method(10, 20)); // ���ٽ� ���2
		
		Func2 func3 = (x,y) -> { return x + y; }; // ���ٽ� ���3
		System.out.println(func3.method(10, 20));
		
		Func2 func4 = (x, y) ->  x + y; // ���ٽ� ���4
		System.out.println(func3.method(10, 20));
		
	}
}
