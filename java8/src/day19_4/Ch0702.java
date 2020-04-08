package day19_4;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Ch0702 {
	public int add(int a, int b) {
		return a+b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public void oper(IntBinaryOperator operator, int a, int b) {
		System.out.println("정적/인스턴스 메소드 참조 : " + operator.applyAsInt(a, b));
	}
	
	public void operS(Function<String, String> stringOperator, String a) {
		System.out.println("매개변수의 메소드 참조 : " + stringOperator.apply(a));
	}
	
	public static void main(String[] args) {
		Ch0702 ex = new Ch0702();
		ex.oper((a, b)->Ch0702.mul(a, b), 1,1);
		
		//정적메소드 참조
		ex.oper(Ch0702::mul, 1, 1);
		
		
		
	}
}
