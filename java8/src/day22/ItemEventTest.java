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
		super("아이템 이벤트 처리");
		
		setLayout(new FlowLayout());
		Box hBox = Box.createHorizontalBox(); // 수평으로 나열
		ButtonGroup rgroup = new ButtonGroup();
		rgroup.add(r1 = new JRadioButton("우리투자증권"));
		hBox.add(r1);
		hBox.add(Box.createHorizontalStrut(30)); // 좌측에서부터 30만큼 빈공간 추가
		rgroup.add(r2 = new JRadioButton("삼성증권"));
		hBox.add(r2);
		hBox.add(Box.createHorizontalStrut(30)); // 좌측에서부터 30만큼 빈공간 추가
		rgroup.add(r3 = new JRadioButton("대우증권"));
		hBox.add(r3);
		hBox.add(Box.createHorizontalStrut(30)); // 좌측에서부터 30만큼 빈공간 추가
		hBox.add(Box.createGlue()); // 무슨 효과지? 자동으로 빈공간 만듬?
		JPanel lpanel = new JPanel(new BorderLayout()); // 동서남북 중앙 레이아웃을 가진 패널
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분")); // 외곽선
		lpanel.add(hBox);

		Box hhBox = Box.createHorizontalBox();
		ButtonGroup rgroup1 = new ButtonGroup();
		rgroup1.add(r4 = new JRadioButton("국민은행"));
		hBox.add(r4);
		hBox.add(Box.createHorizontalStrut(30)); // 좌측에서부터 30만큼 빈공간 추가
		rgroup1.add(r5 = new JRadioButton("외환은행"));
		hBox.add(r5);
		hBox.add(Box.createHorizontalStrut(30)); // 좌측에서부터 30만큼 빈공간 추가
		rgroup1.add(r6 = new JRadioButton("기업은행"));
		hBox.add(r6);
		hBox.add(Box.createHorizontalStrut(30)); // 좌측에서부터 30만큼 빈공간 추가
		hhBox.add(Box.createGlue());
		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
		llpanel.add(hhBox);

		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel);
		cBox.add(llpanel);
		txt1 = new JLabel("증권회사 출력됨");
		txt1.setFont(new Font("굴림", Font.PLAIN, 16));
		cBox.add(txt1);
		txt2 = new JLabel("은행 출력됨");
		txt1.setFont(new Font("굴림", Font.PLAIN, 16));
		cBox.add(txt2);
		add(cBox);
		
		RBHandler rh = new RBHandler();
		r1.addItemListener(rh);
		r2.addItemListener(rh);
		r3.addItemListener(rh);
		r4.addItemListener(rh);
		r5.addItemListener(rh);
		r6.addItemListener(rh);
		


//		add(cBox, BorderLayout.CENTER); // this에 붙인다 = 프레임에 추가

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class RBHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == r1)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 우리 투자증권");
			if (e.getSource() == r2)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 삼성증권");
			if (e.getSource() == r3)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 대우증권");
			if (e.getSource() == r4)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 국민");
			if (e.getSource() == r5)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 외환");
			if (e.getSource() == r6)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 기업");
		}
	}

	public static void main(String[] args) {
		new ItemEventTest();
	}

}
/*
 * 수평박스를 패널에 넣고 수직박스에 넣는다 , 아래처럼 패널1(수평박스1) 패널2(수평박스2)
 */
