package day18;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: "+outterField); //10
				System.out.println("outterField: "+UsingThis.this.outterField + "\n"); //10
				
				System.out.println("outterField: "+innerField);
				System.out.println("outterField: "+this.innerField);
			};
			fi.method();
			
		}
	}
}
