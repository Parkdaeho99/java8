package day21;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreadPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		ThreadPanel p = new ThreadPanel();
		
		f.add(p);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ThreadPanel extends JPanel {
	void init() {
		
	}
}
