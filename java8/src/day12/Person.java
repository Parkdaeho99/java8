package day12;

public class Person {
	//생성자를 만들지 않아서 디폴트 생성자가 자동으로 만들어짐
	void sound() {
		System.out.println("말하다");
	}
	
	void run() {
		System.out.println("달리다");
	}
	
	void eat() {
		System.out.println("음식을 먹다");
	}
	
	void oneDay() {
//		Person person = new Person();
//		person.sound();
		sound();
		run();
		eat();
	}
	
}
