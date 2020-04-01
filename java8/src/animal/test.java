package animal;

public class test {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Animal a1 = new Animal();
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		a1.speak(); //울음소리를 내다
		d1.speak(); //멍멍 오버라이드
		c1.speak(); //야옹 오버라이드
		System.out.println();
		
		/* 부모에게 자식넣기 */
		Animal a2 = new Dog();
		a2.speak(); //멍멍
//		a2.temp(); //Animal 틀에 Dog가 대입되면서 Dog에만 있던 temp가 걸러짐
		a1.haul(d1);
		//Animal형만 받을 수 있는 haul에 Dog형을 넣음 
		//->부모 Animal은 자식 Dog를 받을 수 있다.
		//->자동형변환
		System.out.println();
		
		/* 자식에게 부모넣기 불가능 -> 강제타입캐스팅 */
		d1 = (Dog)a1;
		d1.speak();
		System.out.println();
		
		
	}

}
