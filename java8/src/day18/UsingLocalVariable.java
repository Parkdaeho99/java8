package day18;

public class UsingLocalVariable {
	void method(int arg) { // 밑에 람다식에서 arg를 써버려서 arg는 final 특성을 가짐
		int localVar = 40; // 밑에 람다식에서 localVar을 써버려서 localVar는 final 특성을 가짐
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: "+arg );
			System.out.println("localVar: "+localVar + "\n");
		};
		fi.method();
	}
}
