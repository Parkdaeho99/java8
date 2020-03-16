/**
   이것은 도큐먼트(문서) 주석입니다.
   문서에 대한 기본적인 정보를 표기하는 공간입니다.
   제작자:
   제작일자: 2020-02-20
   설명: 주석을 설명하기 위한 예제입니다.
   이 주석은 거의 사용하지 않습니다.
 */

package java8;

public class juseok {

	public static void main(String[] args) {
		int number1 = 10;	//이것은 한 줄 주석입니다.
		int number2 = 20;	//한 줄에 대한 설명이 필요할 때 사용합니다.
		//이 부분은 주석이 아닙니다. 에러가 발생하게 됩니다.
		int result = number1 +number2;
		System.out.println("number1과 number2의 합은 ");
		System.out.print(result);
		System.out.println("입니다.");
		/* 이것은 여러 줄 주석입니다. 한 줄로 사용해도 되고 여러 줄로 사용해도 됩니다.  */
		
		/*
		  주석의 내용은
		  양쪽 특수문자 내부에만
		  적용됩니다.
		 */
	}

}
