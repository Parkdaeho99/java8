package programmers;

import java.util.Arrays;

//[1, 5, 2, 6, 3, 7, 4] ->	[[2, 5, 3], [4, 4, 1], [1, 7, 3]] ->	[5, 6, 3]
public class Solution001 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		int i[] = new int[3]; //시작 인덱스
		int j[] = new int[3]; //끝 인덱스
		int k[] = new int[3];
		
		for(int l=0; l<3; l++) {
			i[l] = commands[l][0];
		}
		for(int l=0; l<3; l++) {
			j[l] = commands[l][1];
		}
		for(int l=0; l<3; l++) {
			k[l] = commands[l][2];
		}
		
		
		/*
		int i[] = new int[3];
		int j[] = new int[3];
		int k[] = new int[3];
		
		for(int l=0; l<3; l++) {
			i[l] = commands[l][0];
		}
		for(int l=0; l<3; l++) {
			j[l] = commands[l][1];
		}
		for(int l=0; l<3; l++) {
			k[l] = commands[l][2];
		}
		int i_ = i[0]; //첫인덱스 2
		int j_ = commands[0][1]; //끝인덱스 5
		int k_ = commands[0][2];
		int temp[][] = new int[3][7]; //짜른거 저장
		int index=0; 
		int m = 0;
		
		for(int a=0; a<array.length; a++) { //들어온 배열을 처음부터 끝까지 훑으면서
			i_ = i[m]; //첫인덱스 2
			j_ = j[m]; //끝인덱스 5
			k_ = k[m];
			if( a >= i_-1 ) { //첫 인덱스면 temp에 값 넣기 시작
				temp[index][] = array[a];
				temp[index][] = array[a];
				temp[index][] = array[a];
				index++;
				m++;
				if( a == j_ ) { //끝 인덱스면 탈출
					break;
				}
			}
		}
		Arrays.sort(temp);
		System.out.println(temp[k_+1]); */
		
		
//		int i = commands[0][0]; //첫인덱스 2
//		int j = commands[0][1]; //끝인덱스 5
//		int k = commands[0][2];
//		int temp[] = new int[7]; //짜른거 저장
//		int index=0; 
//
//		for(int a=0; a<array.length; a++) { //들어온 배열을 처음부터 끝까지 훑으면서
//			if( a >= i-1 ) { //첫 인덱스면 temp에 값 넣기 시작
//				temp[index] = array[a];
//				index++;
//				if( a == j ) { //끝 인덱스면 탈출
//					break;
//				}
//			}
//		}
//		Arrays.sort(temp);
//		System.out.println(temp[k+1]);
		
		
		return answer;
	}
}
