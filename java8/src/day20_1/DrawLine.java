package day20_1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawLine extends JPanel{
	public void init() {
//		setBackground(Color.orange);
	}
	
	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.blue);
		g.drawLine(10, 20, 150, 150);
		g.setColor(Color.black);
		for(int y = 0; y< 150; y=y+20)
			g.drawLine(10+y, 20, 10+y, 150);
	}
}
