package programmers;

import java.util.Arrays;

//[1, 5, 2, 6, 3, 7, 4] ->	[[2, 5, 3], [4, 4, 1], [1, 7, 3]] ->	[5, 6, 3]
public class Solution001 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		int i[] = new int[3]; //���� �ε���
		int j[] = new int[3]; //�� �ε���
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
		int i_ = i[0]; //ù�ε��� 2
		int j_ = commands[0][1]; //���ε��� 5
		int k_ = commands[0][2];
		int temp[][] = new int[3][7]; //¥���� ����
		int index=0; 
		int m = 0;
		
		for(int a=0; a<array.length; a++) { //���� �迭�� ó������ ������ �����鼭
			i_ = i[m]; //ù�ε��� 2
			j_ = j[m]; //���ε��� 5
			k_ = k[m];
			if( a >= i_-1 ) { //ù �ε����� temp�� �� �ֱ� ����
				temp[index][] = array[a];
				temp[index][] = array[a];
				temp[index][] = array[a];
				index++;
				m++;
				if( a == j_ ) { //�� �ε����� Ż��
					break;
				}
			}
		}
		Arrays.sort(temp);
		System.out.println(temp[k_+1]); */
		
		
//		int i = commands[0][0]; //ù�ε��� 2
//		int j = commands[0][1]; //���ε��� 5
//		int k = commands[0][2];
//		int temp[] = new int[7]; //¥���� ����
//		int index=0; 
//
//		for(int a=0; a<array.length; a++) { //���� �迭�� ó������ ������ �����鼭
//			if( a >= i-1 ) { //ù �ε����� temp�� �� �ֱ� ����
//				temp[index] = array[a];
//				index++;
//				if( a == j ) { //�� �ε����� Ż��
//					break;
//				}
//			}
//		}
//		Arrays.sort(temp);
//		System.out.println(temp[k+1]);
		
		
		return answer;
	}
}
