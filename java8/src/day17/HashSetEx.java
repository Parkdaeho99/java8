package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("포도");
		list.add("멜론");
		list.add("멜론");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println();
		Set<String> set = new HashSet<String>();
		// Set은 데이터 꾸러미, HashSet은 데이터 꾸러미를 구현
		//HashSet은 값을 해쉬코드로 구분한다.
		set.add("사과");
		set.add("배");
		set.add("포도");
		set.add("멜론");
		set.add("멜론");// 이미 위에서 추가된 값이라서 안 넣음 
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println(set.contains("사과"));
		System.out.println(set.isEmpty());
		if(!set.isEmpty()) {
			set.clear();
		}
		System.out.println(set.size());
		System.out.println();
		
		Iterator<String> iterator = list.iterator(); //컬렉션 공통 메소드
		//컬렉션 공통 메소드라서 하위인 ArrayList에서 호출 가능
		while(iterator.hasNext()) { // 다음이 있으면
			String str = iterator.next();
			System.out.println(str);
		}
		
		
		
		
	}
}
