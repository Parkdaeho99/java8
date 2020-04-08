package programmers;

public class Solution002 {
	char[] arr;

	public String temp(String str, int n) {
		arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if ((int) arr[i] == (int) ' ')
				continue;
			else if ((int) arr[i] >= (int) 'A' && (int) arr[i] <= (int) 'Z') {

				if ((int) arr[i] + n > (int) 'Z') {

					arr[i] = (char) ((int) 'A' + (int) arr[i] + n - (int) 'Z' - 1);
					continue;
				}
				arr[i] = (char) ((int) arr[i] + n);
			} else if ((int) arr[i] >= (int) 'a' && (int) arr[i] <= (int) 'z') {

				if ((int) arr[i] + n > (int) 'z') {

					arr[i] = (char) ((int) 'a' + (int) arr[i] + n - (int) 'z' - 1);
					continue;
				}
				arr[i] = (char) ((int) arr[i] + n);
			} else
				System.out.println("잘못된 접근");
		}
		return String.valueOf(arr);
	}
}
