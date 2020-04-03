package day15;

public class MainEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A.C.field2 = 10;
		A.C.method2();
// 		A.C.field1 = 10; static이 아닌 변수
		A.C c = new A.C();
		c.field1 = 10;
		c.field2 = 10;
		c.method2();
		
		A a = new A();
		A.B b = a.new B();
		
	}

}
