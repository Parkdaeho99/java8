package day18;

public class Func2Ex {
	public static void main(String[] args) {
		Func2 func1 = new Func2() { // 익명구현객체
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		System.out.println(func1.method(3, 27));
		
		Func2 func2 = (int x, int y) -> { // 람다식 모양1
			int result = x + y;
			return result;
		};
		System.out.println(func2.method(10, 20)); // 람다식 모양2
		
		Func2 func3 = (x,y) -> { return x + y; }; // 람다식 모양3
		System.out.println(func3.method(10, 20));
		
		Func2 func4 = (x, y) ->  x + y; // 람다식 모양4
		System.out.println(func3.method(10, 20));
		
	}
}
