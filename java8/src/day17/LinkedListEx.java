package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> arryList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		System.out.println("ArrayList¿Í LinkedList ºñ±³");
		long start = System.currentTimeMillis();
		for(int i=0; i<10000000; i++) {
			arryList.add(String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList: "+ (end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=0; i<10000000; i++) {
			linkedList.add(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList: "+ (end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			arryList.add(0,String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList: "+ (end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList: "+ (end - start) + "ms");


	}
	

}
