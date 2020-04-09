package day20_1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorJPanel extends JPanel{
	public void init() {
		//setBackground(Color.orange); 안먹힌다.
		//방법 1 : 패널사용
		//Panel p1 = new Panel();
		//p1.setBackground(Color.orange);
		//this.add(p1);
	}
	
	public void paint(Graphics g) {
		//방법 2 : paint 매소드에서 fillRect 사용
		//g.setColor(Color.orange);
		//g.fillRect(0,0,getWidth().getHeight());
		Color myColor = new Color(255,0,255);
		g.setColor(myColor);
		g.drawString("검정색 글씨를 그린다.", 40, 100);
	}
}
