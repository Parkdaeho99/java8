package day18;

public class Func1Ex {
	public static void main(String[] args) {
		
		Func1 func1 = new Func1() { //�͸�����ü
			public void method(int number) {
				System.out.println(number);
			}
		};
		func1.method(10);
		
		Func1 func2 = (int number) -> { //�͸�����ü�� ������ ����� ���ٽ�
			System.out.println(number);
		};
		func2.method(100); 
		
		Func1 func3 = (number) -> { System.out.println(number); };
		func3.method(100);
		
		Func1 func4 = (number) ->  System.out.println(number);
		func4.method(100);
		
		Func1 func5 = (x) -> System.out.println(x);
		func5.method(100);
	}
}
