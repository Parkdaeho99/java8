package day20_1;

import javax.swing.JFrame;

public class FontJPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("��Ʈ ���� ����"); // Ʋ ���� + �̸� ����
		FontJPanel p = new FontJPanel(); // ������Ʈ(����) ���� -> ���� paint�޼ҵ尡 �ڵ� ����?
		p.init();
		
		f.setSize(600,500);
		//f.setBackground(Color.ORANGE);
		f.add(p); //�����ӿ� ������Ʈ �г� �ű�
		f.setResizable(false);
		f.setVisible(true); //������ ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
