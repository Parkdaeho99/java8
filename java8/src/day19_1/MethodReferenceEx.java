package day19_1;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = new IntBinaryOperator() { //�͸�����ü
			@Override
			public int applyAsInt(int left, int right) {
				
				return Calculator.staticMetohd(left, right);
			}
		};
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = (int left, int right) -> { //���ٽ�
			return Calculator.staticMetohd(left, right);
		};
		
		operator = (x,y) -> Calculator.staticMetohd(x, y); //���ٽ� �� ����
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = Calculator::staticMetohd; //�����޼ҵ� ����
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		Calculator calc = new Calculator();
		operator = calc::instanceMetohd; //�ν��Ͻ� �޼ҵ� ����
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		
	}
}
