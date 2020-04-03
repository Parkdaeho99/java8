package day15;
import java.util.Scanner;

public class Hangman {
	/* 6번내에 맞혀야한다 */
	private String hiddenString;
	private StringBuffer inputString; //사용자 입력 알파벳
	private StringBuffer outputString;
	int remainder; // 남은문자수
	private int failed; // 실패횟수?
	int index;
	StringBuffer sb;
	Scanner sc;

	Hangman() {
		hiddenString = "hello";
		inputString = new StringBuffer();
		sb = new StringBuffer("_____");
		sc = new Scanner(System.in);
		failed = 0;
	}

	public void playGame() {
		for (int i = 0; i < 6; i++) {
			String input;
			System.out.print("알파벳을 입력하세요 >");
			input = sc.next(); //입력
			if( (inputString.indexOf(input)) != -1 ) { //똑같은게 또 입력되었으면
				System.out.println("중복입니다. 다른 알파벳을 입력하세요.");
				i--;
				System.out.println(sb);
				continue;
			} else {
				inputString.append(input); //입력한거 저장
			}
			index = hiddenString.indexOf(input); //입력한게 있는지 찾아보기
			if (index == -1) { //없으면
				failed++;
				System.out.println("발견하지 못했습니다.");
			} else {
				inputString.append(input.charAt(0)); // 입력했던것들 저장
				sb.setCharAt(index, input.charAt(0));
				System.out.println(index + "발견" + sb);
			}
		}
	}
}
