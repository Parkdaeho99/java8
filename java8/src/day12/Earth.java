package day12;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	/* main()�� ���� ������ ����� ����Ǵ� ���� �ƴϴ�. 
	 * �׷��� ����ġ�� System.out.println()�� ���� ���� ��
	 * ������ �ؿ� �ִ� �ٸ� �Լ����� main()���� ȣ��Ǵ� �͵��̴ϱ� syso�� ����
	 */
	
	void temp() {
		java.lang.System.out.println("aaa");
	}
	
	void temp2() {
		this.temp();
	}
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
