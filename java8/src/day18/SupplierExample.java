package day18;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> { // 아무것도 안주고
			int num = (int)(Math.random() * 6 + 1);
			return num; //num을 리턴받는다.
		};
		int num = intSupplier.getAsInt(); //리턴값을 가져온다
		System.out.println("눈의 수: " + num);
	}
	
}
