package default_super;

public class Cylinder extends Circle {
	int height;
	
	Cylinder(){
		super();
		System.out.println("Cylinder ����Ʈ ������");
	}
	
	Cylinder(int r, int h){
		super(r);
		this.height = h;
	}
	
	double volume() {
		
		return area(r)*height;
	}
	
	String showCylinder() {
		return showCircle() + ", Height: " + height;
	}
	
}
