package day16;

import generic.Box2;

public class BoxEx {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		Box box = new Box();
		box.set(name);
		String name2 = (String)box.get();
		Object name3 = box.get();
		System.out.println(name2);
		System.out.println(name3);
		
		Apple apple = new Apple();
		System.out.println(apple.hashCode());
		box.set(apple);
		Apple apple2 = (Apple)box.get();
		System.out.println(apple2.hashCode());
		/*����ȯ ������ �ʹ� ���� -> ���� -> ���׸� �ʿ�*/
		
		Box2<String> box2 = new Box2<>();
		box2.set(name);
		name2 = box2.get();
		System.out.println(name2);
		
//		box2.set(apple);
		Box2<Apple> box3 = new Box2<>();
		box3.set(apple);
		apple2 = box3.get();
//		box3.set(name);
	}
}
