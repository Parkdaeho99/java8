package animal;

public class AnimalEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Animal a1 = new Animal();
		a1.speak();
		a1.run();
		System.out.println();
		a1 = new Dog(); // �θ� �ڽĳֱ�
		a1.speak();
		a1.run();
		System.out.println();
		a1 = new Cat(); // �θ� �ڽĳֱ�
		a1.speak();
		a1.run();
		System.out.println();
		
		Animal a2 = new Animal();
		Animal a3 = new Dog();
		System.out.println();
		a3.speak(); //������ speak
		System.out.println();
		Cat cat = new Cat();
		Dog dog = new Dog();
		a2.haul(cat);
		a2.haul(dog);

		
	}

}
