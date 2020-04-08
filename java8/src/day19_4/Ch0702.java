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
		System.out.println("����/�ν��Ͻ� �޼ҵ� ���� : " + operator.applyAsInt(a, b));
	}
	
	public void operS(Function<String, String> stringOperator, String a) {
		System.out.println("�Ű������� �޼ҵ� ���� : " + stringOperator.apply(a));
	}
	
	public static void main(String[] args) {
		Ch0702 ex = new Ch0702();
		ex.oper((a, b)->Ch0702.mul(a, b), 1,1);
		
		//�����޼ҵ� ����
		ex.oper(Ch0702::mul, 1, 1);
		
		
		
	}
}
