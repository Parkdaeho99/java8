package day20_1;

import javax.swing.JFrame;

public class RoundRectEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("원을 그립시다.");
		RoundRect p = new RoundRect();
		
		f.add(p);
		f.setSize(600,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
