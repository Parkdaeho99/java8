package day20_1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ParamJApplet extends JPanel{ //�г��̶�� ������Ʈ(��ǰ)�� �����. (�����ӿ� �ű� ���ؼ�)
	private static final long serialVersionUID = 1L;
	String title;
	
	public void init(String title) {
		this.title = title;
		if(title == null)
			title = "���޹��� �μ��� ����.";
	}
	
	public void paint(Graphics g) {
		g.drawString(title, 100, 100);
	}

}
