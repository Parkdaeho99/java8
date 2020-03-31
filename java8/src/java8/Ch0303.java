package java8;

import java.util.Scanner;

public class Ch0303 {
	public static void main(String args[]) {
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int max=0;
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("MAX >> " + max);
		sc.close();
			
		
	}
}
