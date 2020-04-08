package day19_1;

import java.util.function.BiFunction;
import java.util.function.Function;

/*생성자참조*/
public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		// String 들어가서 Member 반환
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel");
	
	}
}
