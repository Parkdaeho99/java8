package day19;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (m) -> m.getCity();
		
		functionAB = functionA.andThen(functionB);
		//���� ������� �� �ʿ� �־���
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: "+city);
		
		functionAB = functionB.compose(functionA);
		//���� ������� �� �ʿ� �־���
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: "+city);
	}
}
