package day18;

public class FunctionalEx {
	public static void main(String[] args) {
		Functional f1 = new Functional() {
			public void method(/*����*/) {
				System.out.println("f1 �͸�����ü�� �޼ҵ� ȣ��");
			}
		}; //�͸�����ü
		f1.method();
		
		Functional f2 = (/*����*/) -> {
			System.out.println("f2 ���ٽ����� �޼ҵ� ȣ��");
		};
		
		Functional f3 = (/*����*/) -> System.out.println("f3 ���ٽ����� �޼ҵ� ȣ��");
	}
}
