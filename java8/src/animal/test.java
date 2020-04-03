package animal;

public class test {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Animal a1 = new Dog();
		Dog d1 = new Dog();
		Cat c1 = new Cat();
//		a1.speak(); //울음소리를 내다
//		d1.speak(); //멍멍 오버라이드
//		c1.speak(); //야옹 오버라이드
		System.out.println();
		
//		/* 부모에게 자식넣기 */
//		Animal a2 = new Dog();
//		a2.speak(); //멍멍
////		a2.temp(); //Animal 틀에 Dog가 대입되면서 Dog에만 있던 temp가 걸러짐
//		a1.haul(d1);//멍멍 haul(Animal형객체) -> Animal형은 부모니까 자식들(cat,dog)을 다 받을수있다. 단, 이때 받으면서 부모클래스 틀에 자식들이 다 부딪히면서 자식들이 독단적으로 만든건 다 걸러짐
////		즉, haul이 동작하려면 매개변수로 넣어주는 cat, dog에도 speak가 정의되어있어야한다. 
//		a1.haul(c1); //야옹
//		//Animal형만 받을 수 있는 haul에 Dog형을 넣음 
//		//->부모 Animal은 자식 Dog를 받을 수 있다.
//		//->자동형변환
////		System.out.println();
//		
		/* 자식에게 부모넣기 불가능 -> 강제타입캐스팅 */
		
		d1 = (Dog)a1;
		d1.speak();
		d1.temp();
		System.out.println();
//		
		
	}

}
