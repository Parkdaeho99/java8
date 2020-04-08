package day19_1;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = new IntBinaryOperator() { //익명구현객체
			@Override
			public int applyAsInt(int left, int right) {
				
				return Calculator.staticMetohd(left, right);
			}
		};
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = (int left, int right) -> { //람다식
			return Calculator.staticMetohd(left, right);
		};
		
		operator = (x,y) -> Calculator.staticMetohd(x, y); //람다식 더 생략
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = Calculator::staticMetohd; //정적메소드 참조
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		Calculator calc = new Calculator();
		operator = calc::instanceMetohd; //인스턴스 메소드 참조
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		
	}
}
