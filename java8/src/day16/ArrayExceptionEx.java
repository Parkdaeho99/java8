package day16;

public class ArrayExceptionEx {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		exceptionTest();
	}

	static void exceptionTest() {
		int arr[] = new int[3];
		try {
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();
			//↑강제 예외 발생
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자 연산 불가능 또는 배열 범위 벗어남!!!");
		} catch (Exception e) {
			System.out.println("모든 예외를 처리!!!");
			e.printStackTrace();
			//↑cattch 없을 때 발생되던 오류구문 강제 예외 발생
		} finally { //←예외와 상관없이 실행되는 구간, 없어도 되는 구간
			System.out.println("finally 구간입니다.");
		}
	}
}
