package java8;

public class Day1012 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//advanced for
		int temp[] = {10,20,30,40,50};
		int arr[] = new int[] {10,20,30,40,50};
		
		System.out.println("C형 for문");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		System.out.println();
		
		System.out.println("향상된 for문");
		for(int number : arr) { //arr 처음부터 끝까지 거치면서 number에 저장
			System.out.println(number);
		}
	}

}
