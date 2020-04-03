package generic;

public class Box2<T> { //T타입의 제네릭
	private T object;
	
	public void set(T object) {
		this.object = object;
	}
	public T get() {
		return object;
	}
}
