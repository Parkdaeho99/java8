package day20_1;

import javax.swing.JFrame;

public class ParamJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("애플릿 첫 예제"); // 틀 생성 + 이름 지정
		ParamJApplet p = new ParamJApplet(); // 컴포넌트(내용) 생성
		p.init("Java"); // 컴포넌트 초기화
		f.setSize(300, 300); // 틀 크기 지정
		f.add(p); // 프레임에 컴포넌트 추가
//		f.setTitle("애플릿 첫 예제"); //틀(프로그램) 이름 지정
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 눌렀을때 EXIT_ON_CLOSE 하겠다고 지정, 안해도 닫힘 , 이거 안해주니까 밑에 빨간네모표시 계속 떠있다.
//		f.add(p);
		
		f.setVisible(true); //프레임 보이기
	} 
}
/*
 * 틀이라는 컴포넌트에 내용이라는 컴포넌트를 끼운다?*/
