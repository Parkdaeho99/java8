package day14;

public class PromoEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		PromoChild pc;
		PromoParent pp = new PromoChild(); //자동형변환
		pp.method1();
		pp.method2();
		
		pc = (PromoChild)pp; //자식에게 부모넣기 X -> 부모를 자식형태로 강제변환
		pc.method1();
		pc.method2();
		pc.method3();
		

		
	}

}
