package day20_1;

import javax.swing.JFrame;

public class FontJPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("폰트 설정 예제"); // 틀 생성 + 이름 지정
		FontJPanel p = new FontJPanel(); // 컴포넌트(내용) 생성 -> 내부 paint메소드가 자동 실행?
		p.init();
		
		f.setSize(600,500);
		//f.setBackground(Color.ORANGE);
		f.add(p); //프레임에 컴포넌트 패널 꼽기
		f.setResizable(false);
		f.setVisible(true); //프레임 보기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
