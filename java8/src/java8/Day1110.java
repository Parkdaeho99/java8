package java8;

public class Day1110 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int arr[][] = new int[8][9];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
			}
		}

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int ary[][] = new int[10][10];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = i * j;
			}
		}
		for (int i = 2; i < ary.length; i++) {
			for (int j = 1; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
