package java8;

public class Day0306 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = true;
		boolean var4 = false;
		
		boolean res1 = var1 && var2;
		System.out.println(res1);
		boolean res2 = var2 && var3;
		System.out.println(res2);
		System.out.println(var1 && var3);
		
		boolean light = false;
		System.out.println("���� ������?: " + light);
		System.out.println("���� ������?: " + !light);
		light = !light;
		System.out.println("���� ������?: " + light);
		
	}

}
