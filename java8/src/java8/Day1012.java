package java8;

public class Day1012 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		//advanced for
		int temp[] = {10,20,30,40,50};
		int arr[] = new int[] {10,20,30,40,50};
		
		System.out.println("C�� for��");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		System.out.println();
		
		System.out.println("���� for��");
		for(int number : arr) { //arr ó������ ������ ��ġ�鼭 number�� ����
			System.out.println(number);
		}
	}

}
