package day14;

public class PromoEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		PromoChild pc;
		PromoParent pp = new PromoChild(); //�ڵ�����ȯ
		pp.method1();
		pp.method2();
		
		pc = (PromoChild)pp; //�ڽĿ��� �θ�ֱ� X -> �θ� �ڽ����·� ������ȯ
		pc.method1();
		pc.method2();
		pc.method3();
		

		
	}

}
