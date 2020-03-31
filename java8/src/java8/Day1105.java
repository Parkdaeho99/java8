package java8;

import java.util.Arrays;
import java.util.Random;

public class Day1105 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int arr[] = new int[45];
		
		//1~45�� �Է��� �迭�� �ۼ��մϴ�.
		for(int i=0; i<45; i++) {
			arr[i]=i+1;
		}
		
		//�ۼ��� �迭�� �������� �����ϴ�.
		Random rd = new Random();
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			int rIndex = rd.nextInt(45); //0~44
			temp = arr[rIndex];
			arr[rIndex] = arr[i];
			arr[i] = temp;
		}
		
		//��ü ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
			if( (i+1)%10==0) System.out.println();
		}
		
		//7�� ���
		System.out.println("\n");
		for(int i=0; i<7; i++) 
			System.out.print(arr[i]+"\t");
		
		//�迭 6���� �ε����� ����
		int ary[] = Arrays.copyOf(arr, 6);
		
		//����
		Arrays.sort(ary);
		System.out.println("\n");
		for(int i=0; i<ary.length; i++) 
			System.out.print(arr[i]+"\t");
	}

}
