package day20_1;

import javax.swing.JFrame;

public class PolygonJPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("다각형을 그리자"); // 틀 생성 + 이름 지정
		PolygonJPanel p = new PolygonJPanel(); // 컴포넌트(내용) 생성 -> 내부 paint메소드가 자동 실행?
		
		f.setSize(600,500);
		//f.setBackground(Color.ORANGE);
		f.add(p); //프레임에 컴포넌트 패널 꼽기
		f.setResizable(false);
		f.setVisible(true); //프레임 보기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
