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
		super("박스 레이아웃");
		Box hBox = Box.createHorizontalBox(); //수평으로 나열
		hBox.add(Box.createHorizontalStrut(30)); //좌측에서부터 30만큼 빈공간 추가
		hBox.add(new JCheckBox("우리투자증권")); //체크박스 추가
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("삼성증권"));
		hBox.add(Box.createHorizontalStrut(30)); 
		hBox.add(new JCheckBox("대우증권"));
		hBox.add(Box.createGlue()); //무슨 효과지? 자동으로 빈공간 만듬?
		JPanel lpanel = new JPanel(new BorderLayout()); //동서남북 중앙 레이아웃을 가진 패널
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분")); //외곽선
		lpanel.add(hBox, BorderLayout.CENTER);
		
		Box hhBox = Box.createHorizontalBox();
		hhBox.add(Box.createVerticalStrut(30));
		hhBox.add(new JCheckBox("국민은행"));
		hhBox.add(Box.createVerticalStrut(30));
		hhBox.add(new JCheckBox("외환은행"));
		hhBox.add(Box.createVerticalStrut(30));
		hhBox.add(new JCheckBox("기업은행"));
		hhBox.add(Box.createGlue());
		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
		llpanel.add(hhBox, BorderLayout.CENTER); 
		
		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel); 
		cBox.add(llpanel); 
		add(cBox,BorderLayout.CENTER); //this에 붙인다 = 프레임에 추가
		
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
