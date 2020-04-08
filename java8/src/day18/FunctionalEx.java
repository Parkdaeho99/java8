package day18;

public class FunctionalEx {
	public static void main(String[] args) {
		Functional f1 = new Functional() {
			public void method(/*여기*/) {
				System.out.println("f1 익명구현객체로 메소드 호출");
			}
		}; //익명구현객체
		f1.method();
		
		Functional f2 = (/*여기*/) -> {
			System.out.println("f2 람다식으로 메소드 호출");
		};
		
		Functional f3 = (/*여기*/) -> System.out.println("f3 람다식으로 메소드 호출");
	}
}
