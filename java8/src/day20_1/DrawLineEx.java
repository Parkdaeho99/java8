package day20_1;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class DrawLineEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("¼± ±ß±â");
		DrawLine p = new DrawLine();
		f.setBackground(Color.orange);
		f.setSize(500,500);
		f.add(p);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
}
