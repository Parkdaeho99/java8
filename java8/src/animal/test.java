package animal;

public class test {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Animal a1 = new Animal();
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		a1.speak(); //�����Ҹ��� ����
		d1.speak(); //�۸� �������̵�
		c1.speak(); //�߿� �������̵�
		System.out.println();
		
		/* �θ𿡰� �ڽĳֱ� */
		Animal a2 = new Dog();
		a2.speak(); //�۸�
//		a2.temp(); //Animal Ʋ�� Dog�� ���ԵǸ鼭 Dog���� �ִ� temp�� �ɷ���
		a1.haul(d1);
		//Animal���� ���� �� �ִ� haul�� Dog���� ���� 
		//->�θ� Animal�� �ڽ� Dog�� ���� �� �ִ�.
		//->�ڵ�����ȯ
		System.out.println();
		
		/* �ڽĿ��� �θ�ֱ� �Ұ��� -> ����Ÿ��ĳ���� */
		d1 = (Dog)a1;
		d1.speak();
		System.out.println();
		
		
	}

}