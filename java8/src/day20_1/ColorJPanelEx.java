package day20_1;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorJPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("색상 변환 예제"); // 틀 생성 + 이름 지정
		ColorJPanel p = new ColorJPanel(); // 컴포넌트(내용) 생성 -> 내부 paint메소드가 자동 실행?
		f.setSize(300,300);
		f.setBackground(Color.ORANGE);
		f.add(p); //프레임에 컴포넌트 패널 꼽기
		f.setVisible(true); //프레임 보기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
