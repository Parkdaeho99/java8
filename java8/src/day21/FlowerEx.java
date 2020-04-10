package day21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowerEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Flower p = new Flower();
		
		f.add(p);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Flower extends JPanel{
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(100, 100, 100, 100);
		g.setColor(Color.gray);
		g.fillOval(125, 125, 50, 50);
		g.setColor(Color.gray);
		g.fillRect(145, 202, 10, 25);
		g.setColor(Color.DARK_GRAY);
		g.fillArc(130, 205, 20, 20, 120, 170);

		g.fillArc(160, 205, 80, 80, 120, 180);
		
		
		
		g.setColor(Color.DARK_GRAY);
		g.fillOval(300, 300, 100, 100);
		g.setColor(Color.gray);
		g.fillOval(325, 325, 50, 50);
	}
}
