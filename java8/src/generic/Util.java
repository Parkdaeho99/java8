package generic;

public class Util {
	public static <T> Box2<T> boxing(T t) {
		// <T> �Ű������� �Ķ����, Box2<T> ����Ÿ��, T t �Ű�����
		Box2<T> box = new Box2<T>();
		box.set(t);
		return box;
	}
}
