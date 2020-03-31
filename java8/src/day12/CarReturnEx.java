package day12;

public class CarReturnEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		CarReturn myCar = new CarReturn();
		myCar.setGas(5);
		if(myCar.isLeftGas()) {
			myCar.run();
		} else {
			System.out.println("가스를 충전하세요");
		}
		
	}

}
