package day12;

//나만 쓸 수 있는 클래스 private 같은건 없다.
public class Singleton {
	private static Singleton singleton = new Singleton();
	//나만 쓸 수 있는 객체 private
	//+외부에서 호출할 수 있게 static
	//메모리 최소화를 위해 한개의 객체만 만들수있게 객체를 미리 만들어 둔다.
	//이 객체만 계속 쓰라고
	
	private Singleton() {
		//외부 호출 막는 private
	}
	
	static Singleton getInstance() {
		//외부 호출을 위한 함수
		return singleton;
	}
}
