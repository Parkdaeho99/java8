package day12;

public class CompareToEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		String a = "aaa"; // a = 97
		String b = "Acc"; // A = 65 
		int res = a.compareTo(b); // 97 - 65 = 32
		// a�� b�� ���ؼ� �����ϱ� ����
		System.out.println(res);
		
		String c = "Java Programming Very Good";
		String d = "java Programming";
		boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
		//��ҹ��� �����Ͽ�
		boolean compare2 = c.regionMatches(true, 0, d, 0, 4);
		boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
	}

}
