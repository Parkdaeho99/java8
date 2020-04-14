package day22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ItemEventTest extends JFrame {
	JLabel txt1, txt2;
	JRadioButton r1, r2, r3, r4, r5, r6;

	public ItemEventTest() {
		super("������ �̺�Ʈ ó��");
		
		setLayout(new FlowLayout());
		Box hBox = Box.createHorizontalBox(); // �������� ����
		ButtonGroup rgroup = new ButtonGroup();
		rgroup.add(r1 = new JRadioButton("�츮��������"));
		hBox.add(r1);
		hBox.add(Box.createHorizontalStrut(30)); // ������������ 30��ŭ ����� �߰�
		rgroup.add(r2 = new JRadioButton("�Ｚ����"));
		hBox.add(r2);
		hBox.add(Box.createHorizontalStrut(30)); // ������������ 30��ŭ ����� �߰�
		rgroup.add(r3 = new JRadioButton("�������"));
		hBox.add(r3);
		hBox.add(Box.createHorizontalStrut(30)); // ������������ 30��ŭ ����� �߰�
		hBox.add(Box.createGlue()); // ���� ȿ����? �ڵ����� ����� ����?
		JPanel lpanel = new JPanel(new BorderLayout()); // �������� �߾� ���̾ƿ��� ���� �г�
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����")); // �ܰ���
		lpanel.add(hBox);

		Box hhBox = Box.createHorizontalBox();
		ButtonGroup rgroup1 = new ButtonGroup();
		rgroup1.add(r4 = new JRadioButton("��������"));
		hBox.add(r4);
		hBox.add(Box.createHorizontalStrut(30)); // ������������ 30��ŭ ����� �߰�
		rgroup1.add(r5 = new JRadioButton("��ȯ����"));
		hBox.add(r5);
		hBox.add(Box.createHorizontalStrut(30)); // ������������ 30��ŭ ����� �߰�
		rgroup1.add(r6 = new JRadioButton("�������"));
		hBox.add(r6);
		hBox.add(Box.createHorizontalStrut(30)); // ������������ 30��ŭ ����� �߰�
		hhBox.add(Box.createGlue());
		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));
		llpanel.add(hhBox);

		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel);
		cBox.add(llpanel);
		txt1 = new JLabel("����ȸ�� ��µ�");
		txt1.setFont(new Font("����", Font.PLAIN, 16));
		cBox.add(txt1);
		txt2 = new JLabel("���� ��µ�");
		txt1.setFont(new Font("����", Font.PLAIN, 16));
		cBox.add(txt2);
		add(cBox);
		
		RBHandler rh = new RBHandler();
		r1.addItemListener(rh);
		r2.addItemListener(rh);
		r3.addItemListener(rh);
		r4.addItemListener(rh);
		r5.addItemListener(rh);
		r6.addItemListener(rh);
		


//		add(cBox, BorderLayout.CENTER); // this�� ���δ� = �����ӿ� �߰�

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class RBHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == r1)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : �츮 ��������");
			if (e.getSource() == r2)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : �Ｚ����");
			if (e.getSource() == r3)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : �������");
			if (e.getSource() == r4)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : ����");
			if (e.getSource() == r5)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : ��ȯ");
			if (e.getSource() == r6)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : ���");
		}
	}

	public static void main(String[] args) {
		new ItemEventTest();
	}

}
/*
 * ����ڽ��� �гο� �ְ� �����ڽ��� �ִ´� , �Ʒ�ó�� �г�1(����ڽ�1) �г�2(����ڽ�2)
 */
