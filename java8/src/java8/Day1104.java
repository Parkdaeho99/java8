package java8;

import java.util.Scanner;

public class Day1104 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int cnt = 1;
		int arr[][] = new int[5][7];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i%2 != 0) { //�������
					System.out.print(arr[i][arr[i].length-1-j] + "\t");
					continue;
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
