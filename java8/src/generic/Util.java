package generic;

public class Util {
	public static <T> Box2<T> boxing(T t) {
		// <T> 매개변수의 파라미터, Box2<T> 리턴타입, T t 매개변수
		Box2<T> box = new Box2<T>();
		box.set(t);
		return box;
	}
}
