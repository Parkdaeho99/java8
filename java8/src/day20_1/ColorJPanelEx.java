package day20_1;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorJPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("���� ��ȯ ����"); // Ʋ ���� + �̸� ����
		ColorJPanel p = new ColorJPanel(); // ������Ʈ(����) ���� -> ���� paint�޼ҵ尡 �ڵ� ����?
		f.setSize(300,300);
		f.setBackground(Color.ORANGE);
		f.add(p); //�����ӿ� ������Ʈ �г� �ű�
		f.setVisible(true); //������ ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
