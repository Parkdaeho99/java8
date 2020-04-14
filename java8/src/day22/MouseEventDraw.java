package day22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventDraw extends JPanel implements MouseListener {
	int noval = 0;
	int[] x, y;

	public MouseEventDraw() {
		x = new int[50];
		y = new int[50];
		addMouseListener(this);
	} 

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("마우스를 클릭하면 사각형을 그림", 10, 10);
		g.setColor(Color.red);
		for(int i=1; i<=noval; i++) {
			System.out.println(i);
			g.drawRect(x[i]-20, y[i]-20, 50, 50);
			System.out.println("반복문탈출");
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스클릭ㅁㅁ");
		if(noval < 50) {
			x[noval] = e.getX();
			y[noval] = e.getY();
			noval++;
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 자동 생성된 메소드 스텁

	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		MouseEventDraw med = new MouseEventDraw();
		f.add(med);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
