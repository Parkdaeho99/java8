package day20_1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ParamJApplet extends JPanel{ //패널이라는 컴포넌트(부품)를 만든다. (프레임에 꼽기 위해서)
	private static final long serialVersionUID = 1L;
	String title;
	
	public void init(String title) {
		this.title = title;
		if(title == null)
			title = "전달받은 인수가 없음.";
	}
	
	public void paint(Graphics g) {
		g.drawString(title, 100, 100);
	}

}
