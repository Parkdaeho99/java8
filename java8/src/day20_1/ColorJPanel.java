package day20_1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorJPanel extends JPanel{
	public void init() {
		//setBackground(Color.orange); �ȸ�����.
		//��� 1 : �гλ��
		//Panel p1 = new Panel();
		//p1.setBackground(Color.orange);
		//this.add(p1);
	}
	
	public void paint(Graphics g) {
		//��� 2 : paint �żҵ忡�� fillRect ���
		//g.setColor(Color.orange);
		//g.fillRect(0,0,getWidth().getHeight());
		Color myColor = new Color(255,0,255);
		g.setColor(myColor);
		g.drawString("������ �۾��� �׸���.", 40, 100);
	}
}