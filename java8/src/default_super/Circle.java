package default_super;

public class Circle {
	private final static double PI = 3.14;
	int r;
	
	Circle(){
		System.out.println("Circle ����Ʈ ������");
	}
	
	public Circle(int r){
		this.r = r;
	}
	
	public double area(int r) {
		return PI*r*r;
	}
	String showCircle() {
		return "Radius: "+ r;
	}
}
