package day15;

public class MainEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		A.C.field2 = 10;
		A.C.method2();
// 		A.C.field1 = 10; static�� �ƴ� ����
		A.C c = new A.C();
		c.field1 = 10;
		c.field2 = 10;
		c.method2();
		
		A a = new A();
		A.B b = a.new B();
		
	}

}
