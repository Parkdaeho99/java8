package day21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PieChartEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		PieChart p = new PieChart();
		
		f.add(p);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class PieChart extends JPanel {
	int[] input = {30,15,45,10};
	String[] title = {"Äá","¹Ð","½Ò","¿Á¼ö¼ö"};
	Color[] color= {Color.red, Color.orange, Color.blue, Color.gray};
	
	@Override
	public void paint(Graphics g) {
		int startAngle = 0;
		int pieSize = 200;
		int subtot = 0; //???
		
		for(int i=0; i<input.length; i++) {
			//ÆÄÀÌ
			g.setColor(color[i]);
			g.fillArc(100, 100, pieSize, pieSize, startAngle*90, 90);
			//¹ü·Ê
			g.setColor(color[i]);
			g.fillRect(300, 300+i*80, 50, 50);
			g.setColor(Color.black);
			g.drawString(title[i], 300, 225+i*80);
			
		}
	}
}

