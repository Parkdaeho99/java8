package �������;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Gui extends JFrame {
	final static int fWidth = 500, fHeight = 500;
	final static int width = 5, height = 5; // ����ũ�� ���簢���� ����
	int cIndex = width * height - 1; // �� �ε���
	JPanel jp1;
	JLabel jlb1[];
	JLabel jlbtemp; // ���ҿ� ��
	int inputKey; // �����¿�
	Point cPoint; // ��ĭ�� ��ǥ
	int rNum1; // 1~100 ����
	int rNum2; // 37~40 ����

	public Gui() {
		super("�������");
		jp1 = new JPanel();
		jlb1 = new JLabel[width * height];
		jlbtemp = new JLabel();
		cPoint = new Point();

		/* �� ���� */
		for (int i = 0; i < width * height; i++) {
			if (i == (width * height - 1)) {
				jlb1[i] = new JLabel("����");
				jlb1[i].setFont(new Font("Serif", Font.BOLD, 30));
				jlb1[i].setHorizontalAlignment(JLabel.CENTER);
				jlb1[i].setEnabled(false);
				jp1.add(jlb1[i]);
				continue;
			}
			jlb1[i] = new JLabel(String.valueOf(i + 1));
			jlb1[i].setFont(new Font("Serif", Font.BOLD, 30));
			jlb1[i].setHorizontalAlignment(JLabel.CENTER);
			jlb1[i].setEnabled(false);
			jp1.add(jlb1[i]);
		}
		jp1.setLayout(new GridLayout(width, height));

		/* Ű���� �׼Ǹ����� */
		addKeyListener(new KeyListener() {
			/* ����Ű�� ���� ����Ű�� ����, �� �ܿ��� ����Ű�� play ȣ�� */
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					rNum1 = (int) (Math.random() * 100) + 1;
					for (int i = 0; i < rNum1; i++) {
						inputKey = (int) (Math.random() * 4) + 37;
						play(inputKey);
					}
				} else {
					play(e.getKeyCode());
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

		add(jp1);
		setSize(fWidth, fHeight);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void play(int keyCode) {
		cPoint.setLocation(jlb1[cIndex].getLocation()); // ������ ������ǥ
		inputKey = keyCode;
		switch (inputKey) {
		case KeyEvent.VK_UP:
			if (cIndex < width) {
				System.out.println("�迭�� �ʰ�");
				break;
			}
			System.out.println("��");
			jlbtemp.setText(jlb1[cIndex - width].getText());
			jlb1[cIndex - width].setText(jlb1[cIndex].getText());
			jlb1[cIndex].setText(jlbtemp.getText());
			cIndex = cIndex - width;
			break;
		case KeyEvent.VK_RIGHT:
			if (cIndex % width == width - 1) {
				System.out.println("�迭�� �ʰ�");
				break;
			}
			System.out.println("������");
			jlbtemp.setText(jlb1[cIndex + 1].getText());
			jlb1[cIndex + 1].setText(jlb1[cIndex].getText());
			jlb1[cIndex].setText(jlbtemp.getText());
			cIndex++;
			break;
		case KeyEvent.VK_LEFT:
			if (cIndex % width == 0) {
				System.out.println("�迭�� �ʰ�");
				break;
			}
			System.out.println("����");
			jlbtemp.setText(jlb1[cIndex - 1].getText());
			jlb1[cIndex - 1].setText(jlb1[cIndex].getText());
			jlb1[cIndex].setText(jlbtemp.getText());
			cIndex--;
			break;
		case KeyEvent.VK_DOWN:
			if (cIndex >= width * height - width) {
				System.out.println("�迭�� �ʰ�");
				break;
			}
			System.out.println("�Ʒ�");
			jlbtemp.setText(jlb1[cIndex + width].getText());
			jlb1[cIndex + width].setText(jlb1[cIndex].getText());
			jlb1[cIndex].setText(jlbtemp.getText());
			cIndex = cIndex + width;
			break;
		default:
			System.out.println("�߸��� ����");
			break;
		}
		System.out.println("play �޼ҵ带 Ż���մϴ�");
	}

	public static void main(String[] args) {
		new Gui();
	}
}
