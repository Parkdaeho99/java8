package java8;

import java.util.Arrays;
import java.util.Random;

public class Day1106 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/*
		 * 로또 생성기 작성 1. 6개의 랜덤한 숫자(1~45)를 배열에 입력
		 */
		Random rd = new Random();
		int rNum[] = new int[6];
//		for(int i=0; i<rNum.length; i++) {
//			rNum[i] = rd.nextInt(45)+1;
//			System.out.print(rNum[i]+"\t");
//		}

		for (int i = 0; i < rNum.length; i++) { //0~5
			rNum[i] = rd.nextInt(45) + 1; //1~45
			for (int j = 0; j < i; j++) { //생성한 수
				if (rNum[i] == rNum[j]) {
					i--; //포문 횟수를 하나 줄여서 랜덤번호 재생성
					break;
				}
			}
		}
//		for(int i=0; i<rNum.length-1; i++) {
//			for(int j=1; j<rNum.length-i-1; j++) {
//				if(rNum[i]==rNum[j]) {
//					System.out.println(rNum[i]+" aaa"+rNum[j]);
//					while(rNum[i]!=rNum[j]) {
//						rNum[j] = rd.nextInt(45)+1;
//					}
//				}
//			}
		Arrays.sort(rNum);
		System.out.println();
		for (int i = 0; i < rNum.length; i++) {
			System.out.print(rNum[i] + "\t");
		}
	}

}
