package animal;

public class AnimalEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Animal a1 = new Animal();
		a1.speak();
		a1.run();
		System.out.println();
		a1 = new Dog(); // 부모에 자식넣기
		a1.speak();
		a1.run();
		System.out.println();
		a1 = new Cat(); // 부모에 자식넣기
		a1.speak();
		a1.run();
		System.out.println();
		
		Animal a2 = new Animal();
		Animal a3 = new Dog();
		System.out.println();
		a3.speak(); //도그의 speak
		System.out.println();
		Cat cat = new Cat();
		Dog dog = new Dog();
		a2.haul(cat);
		a2.haul(dog);

		
	}

}
