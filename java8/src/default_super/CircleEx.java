package default_super;

public class CircleEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Cylinder cylinder = new Cylinder(10,20);
		System.out.println(cylinder.showCylinder());
		System.out.println(cylinder.volume());
		cylinder = new Cylinder();
		System.out.println(cylinder.height);
		System.out.println(cylinder.r);
	}

}
