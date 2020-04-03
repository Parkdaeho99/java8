package generic;

public class UtilEx {
	public static void main(String[] args) {
		Box2<String> box = Util.<String>boxing("ȫ�浿");
		String name = box.get();
		System.out.println(name);
		
		Box2<Integer> box2 = Util.boxing(100);
		int number = box2.get();
		System.out.println(number);
	}
}
