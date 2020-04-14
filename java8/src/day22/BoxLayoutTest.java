package day22;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BoxLayoutTest extends JFrame{
	public BoxLayoutTest() {
		super("�ڽ� ���̾ƿ�");
		Box hBox = Box.createHorizontalBox(); //�������� ����
		hBox.add(Box.createHorizontalStrut(30)); //������������ 30��ŭ ����� �߰�
		hBox.add(new JCheckBox("�츮��������")); //üũ�ڽ� �߰�
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("�Ｚ����"));
		hBox.add(Box.createHorizontalStrut(30)); 
		hBox.add(new JCheckBox("�������"));
		hBox.add(Box.createGlue()); //���� ȿ����? �ڵ����� ����� ����?
		JPanel lpanel = new JPanel(new BorderLayout()); //�������� �߾� ���̾ƿ��� ���� �г�
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����")); //�ܰ���
		lpanel.add(hBox, BorderLayout.CENTER);
		
		Box hhBox = Box.createHorizontalBox();
		hhBox.add(Box.createVerticalStrut(30));
		hhBox.add(new JCheckBox("��������"));
		hhBox.add(Box.createVerticalStrut(30));
		hhBox.add(new JCheckBox("��ȯ����"));
		hhBox.add(Box.createVerticalStrut(30));
		hhBox.add(new JCheckBox("�������"));
		hhBox.add(Box.createGlue());
		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));
		llpanel.add(hhBox, BorderLayout.CENTER); 
		
		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel); 
		cBox.add(llpanel); 
		add(cBox,BorderLayout.CENTER); //this�� ���δ� = �����ӿ� �߰�
		
//		add(lpanel);
//		add(llpanel);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BoxLayoutTest(); 
	}

}
