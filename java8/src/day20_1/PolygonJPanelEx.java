package day20_1;

import javax.swing.JFrame;

public class PolygonJPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("�ٰ����� �׸���"); // Ʋ ���� + �̸� ����
		PolygonJPanel p = new PolygonJPanel(); // ������Ʈ(����) ���� -> ���� paint�޼ҵ尡 �ڵ� ����?
		
		f.setSize(600,500);
		//f.setBackground(Color.ORANGE);
		f.add(p); //�����ӿ� ������Ʈ �г� �ű�
		f.setResizable(false);
		f.setVisible(true); //������ ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
