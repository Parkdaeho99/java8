package day19_4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ch0701 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, String> map = new Hashtable<String, String>();
		for (int i = 0; i < 2; i++) {
			String name = sc.next();
			String number = sc.next();
			map.put(name, number);
		}
		
		String name;
		System.out.print("ã�� ��� �̸� �Է�>");
		name = sc.next();
		
		String result = map.getOrDefault(name, "���� �� ��ȯ�Ǵ� ��");
		System.out.println(result);

	}
}
