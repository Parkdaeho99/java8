package day20_1;

import javax.swing.JFrame;

public class ParamJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("���ø� ù ����"); // Ʋ ���� + �̸� ����
		ParamJApplet p = new ParamJApplet(); // ������Ʈ(����) ����
		p.init("Java"); // ������Ʈ �ʱ�ȭ
		f.setSize(300, 300); // Ʋ ũ�� ����
		f.add(p); // �����ӿ� ������Ʈ �߰�
//		f.setTitle("���ø� ù ����"); //Ʋ(���α׷�) �̸� ����
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư �������� EXIT_ON_CLOSE �ϰڴٰ� ����, ���ص� ���� , �̰� �����ִϱ� �ؿ� �����׸�ǥ�� ��� ���ִ�.
//		f.add(p);
		
		f.setVisible(true); //������ ���̱�
	} 
}
/*
 * Ʋ�̶�� ������Ʈ�� �����̶�� ������Ʈ�� �����?*/
