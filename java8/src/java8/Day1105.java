package java8;

import java.util.Arrays;
import java.util.Random;

public class Day1105 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int arr[] = new int[45];
		
		//1~45를 입력한 배열을 작성합니다.
		for(int i=0; i<45; i++) {
			arr[i]=i+1;
		}
		
		//작성한 배열을 무작위로 섞습니다.
		Random rd = new Random();
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			int rIndex = rd.nextInt(45); //0~44
			temp = arr[rIndex];
			arr[rIndex] = arr[i];
			arr[i] = temp;
		}
		
		//전체 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
			if( (i+1)%10==0) System.out.println();
		}
		
		//7개 출력
		System.out.println("\n");
		for(int i=0; i<7; i++) 
			System.out.print(arr[i]+"\t");
		
		//배열 6개의 인덱스만 복사
		int ary[] = Arrays.copyOf(arr, 6);
		
		//정렬
		Arrays.sort(ary);
		System.out.println("\n");
		for(int i=0; i<ary.length; i++) 
			System.out.print(arr[i]+"\t");
	}

}
