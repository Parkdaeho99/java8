package day12;

public class Car {
	//Car() {} //����Ʈ������ ����(���� ����� �˾Ƽ� �߰� ��)
	String company = "���";
	String model = "���";
	String color = "�Ķ�";
	int maxSpeed = 250;
	int speed = 0;
	
	Car() {
		//�����ε�(�ߺ�����)
		//�Ű������� �ϳ��� ���� �����ڿ� �Ʒ��� �ִ� ������
		//�ʿ��Ѹ�ŭ ������ �� �ִ�.
		//��, �Ű����� ������ ������ �ȵȴ�.
		//Car(String a, String b, int c) Car(String d, String e, int f)
		//�� ó�� ����� ������ ȣ���� �� �Ѿ���� �Ű����� ������ ���Ƽ�
		//�� ȣ���ؾ����� ���� ����
		this("���","����",300);
//		this.company = "���";
//		this.color = "����";
//		this.maxSpeed = 300;
	}
	
	Car(String company, String col, int maxSpeed) {
		this.company = company;
		//this�� ������(Car)�� ���� Ŭ����(Class Car)
		//�������� �޸��ϴ� �ͺ��� this�� �� ��ȣ
		color = col;
		//color�� col�� ���еǹǷ�  this �Ƚᵵ ��
		this.maxSpeed = maxSpeed;
	} //������ ����(���� ����� �˾Ƽ� �߰� ��)
	
	Car(String color, int maxSpeed){
		this("���", color, maxSpeed);
		//�Ʒ�ó�� ��� ���ָ� ����ϱ� this�� �� �ڽ��� �����ڸ� ȣ��
//		this.company = "���";
//		this.color = color;
//		this.maxSpeed = maxSpeed;
	}
	
	Car(int maxSpeed){
		this("���","����",maxSpeed);
//		this.company = "���";
//		this.color = "����";
//		this.maxSpeed = maxSpeed;
	}
	
//	Car(String company, int maxSpeed, String color){
//		
//	}
//	
//	Car(String col, int speed, int maxSpeed){
//		
//	}
	
	/*�޼ҵ带 ��������*/
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("���� �ӵ�"+speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("���� �ӵ�"+speed);
	}
}
