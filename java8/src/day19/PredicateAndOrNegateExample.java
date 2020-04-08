package day19;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		IntPredicate predicateA = a -> a%2 == 0; //2의 배수 검사
		
		IntPredicate predicateB = a -> a%3 == 0; //3의 배수 검사
		
		IntPredicate predicateAB;
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		// A B 모두 만족해야 true
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? "+result);
		
		predicateAB = predicateA.negate();
		// A의 반대
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? "+result);
	}
}
