package day17;

import java.util.Stack;

public class Statck {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int num;
		try {
			num = stack.peek();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("데이터 없음");
		}

		stack.push(10);
		stack.push(20);
		num = stack.peek();
		System.out.println(num);
		System.out.println();
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		while(!stack.isEmpty()) {
			num = stack.pop();
			System.out.println(num);
		}
		System.out.println(stack.isEmpty());
	}

}
