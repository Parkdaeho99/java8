package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ch0304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 자동 생성된 메소드 스텁
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner(System.in);
		int temp = 0; // 스왑
		int sum = 0;
		int cnt = 10; // 입력값 개수
		System.out.print("숫자 입력 시작>");

		int arr[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(inbr.readLine());
			// arr[i] = sc.nextInt();
		}

		System.out.print("입력 데이터 값>");
		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + "..");
		}

//		for (int j = 0; j < cnt - 1; j++) {
//			for (int i = 0; i < cnt-1; i++) {
//				if (arr[i] > arr[i + 1]) {
//					temp = arr[i + 1];
//					arr[i + 1] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
		
		Arrays.sort(arr); //Integer.parseInt() 같은놈
		//내림차순은 없다.
		
		for (int i = 0; i < cnt; i++) {
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.print("정렬 데이터 값>");
		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + "..");
			if (i == 9) {
				System.out.println();
				System.out.println("합계>" + sum + "\n" + "평균>" + sum / 10);
			}
		}
		// sc.close();
	}

}
