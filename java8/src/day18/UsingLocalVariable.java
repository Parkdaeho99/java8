package day18;

public class UsingLocalVariable {
	void method(int arg) { // �ؿ� ���ٽĿ��� arg�� ������� arg�� final Ư���� ����
		int localVar = 40; // �ؿ� ���ٽĿ��� localVar�� ������� localVar�� final Ư���� ����
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: "+arg );
			System.out.println("localVar: "+localVar + "\n");
		};
		fi.method();
	}
}
