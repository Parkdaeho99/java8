package day15;

public class A {
	A() { System.out.println("A ��ü�� ������"); }
	// �ν��Ͻ� ��� Ŭ����
	class B {
		B() {
			System.out.println("B ��ü�� ������");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2(){}
	}

	// ���� ��� Ŭ����
	static class C {
		C() {
			System.out.println("C��ü�� ������");
		}

		int field1;
		static int field2;

		void ethod1() {
		}

		static void method2() {
		}
	}

	void method() {
		class D {
			D() {
				System.out.println("D��ü�� ������");
			}

			int field1;

			// static int field2;
			void method1() {
			}
			// static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

	// �ν��Ͻ� �ʵ�
	B outerField1 = new B();
	C outerField2 = new C();

	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}

	// ���� �ʵ� �ʱ�ȭ
	// static B outerField3 = new B();
	static C outerField4 = new C();

	// ���� �޼ҵ�
	static void method2() {
		C var2 = new C();
	}

}
