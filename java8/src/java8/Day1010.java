package java8;

public class Day1010 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		if(args.length != 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("2���� ������ �Է����ּ���.");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
		String num1 = args[0];
		String num2 = args[1];
		int inum1 = Integer.parseInt(num1);
		int inum2 = Integer.parseInt(num2);
		
		System.out.println(num1 +", "+ num2);
		System.out.println("num1+num2 = "+ (inum1+inum2));
	}
	

}
