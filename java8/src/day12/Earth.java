package day12;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	/* main()이 없기 때문에 여기는 실행되는 곳이 아니다. 
	 * 그래서 현위치에 System.out.println()을 쓰면 에러 뜸
	 * 하지만 밑에 있는 다른 함수들은 main()에서 호출되는 것들이니까 syso가 써짐
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
