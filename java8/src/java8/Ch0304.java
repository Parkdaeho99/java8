package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ch0304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO �ڵ� ������ �޼ҵ� ����
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner(System.in);
		int temp = 0; // ����
		int sum = 0;
		int cnt = 10; // �Է°� ����
		System.out.print("���� �Է� ����>");

		int arr[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(inbr.readLine());
			// arr[i] = sc.nextInt();
		}

		System.out.print("�Է� ������ ��>");
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
		
		Arrays.sort(arr); //Integer.parseInt() ������
		//���������� ����.
		
		for (int i = 0; i < cnt; i++) {
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.print("���� ������ ��>");
		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + "..");
			if (i == 9) {
				System.out.println();
				System.out.println("�հ�>" + sum + "\n" + "���>" + sum / 10);
			}
		}
		// sc.close();
	}

}
