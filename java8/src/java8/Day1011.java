package java8;

import java.util.Arrays;

public class Day1011 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int arr1[] = {10,20,30};
		int arr2[] = arr1;
		for(int i=0; i<arr2.length; i++)
			System.out.println(arr2[i]); //SystemArryCopy 안써도 되네?
		System.out.println();
		int arr3[] = new int[5];
		System.arraycopy(arr1, 0, arr3, 3, 2);
		for(int i=0; i<arr3.length; i++)
			System.out.println(arr3[i]);
		
		int arr4[] = Arrays.copyOf(arr1, arr1.length);
		for(int i=0; i<arr4.length; i++)
			System.out.println(arr4[i]);
	}

}
