package day12;

public class CarReturnEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		CarReturn myCar = new CarReturn();
		myCar.setGas(5);
		if(myCar.isLeftGas()) {
			myCar.run();
		} else {
			System.out.println("������ �����ϼ���");
		}
		
	}

}
