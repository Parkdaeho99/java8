package day22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventTest extends JFrame implements ActionListener{
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	public ActionEventTest() {
		super("액션이벤트 처리"); 
		setLayout(new FlowLayout());
		jbtn1 = new JButton("입력");
		add(jbtn1);
		jbtn2 = new JButton("확인");
		add(jbtn2);
		jbtn3 = new JButton("옵션");
		add(jbtn3);
		jbtn4 = new JButton("메시지");
		add(jbtn4); //this가 생략, this는 JFrame, thist가 액션이벤트테스트가 아니고 JFrame? 왜?
		
		jbtn1.addActionListener(this); //this는 액션리스너
		jbtn2.addActionListener(this); //this가 ActionEventTest가 아니고 액션리스너? 왜?
		jbtn3.addActionListener(this);
		jbtn4.addActionListener(this);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == jbtn1 ) {
			String name = JOptionPane.showInputDialog(this, "이름을 입력하세요");
			//부모 컴포넌트가 나 자신 this다?
			System.out.println(name);
		}
		if( e.getSource() == jbtn2 ) {
			int con = JOptionPane.showConfirmDialog(this, "확인?");
			if( con == JOptionPane.YES_NO_OPTION) {
				if( con == JOptionPane.YES_OPTION ) System.out.println("yes");
			}
		}
		if( e.getSource() == jbtn3 ) {
			String[] option = {"검색","추가","취소"};
			JOptionPane.showOptionDialog(this, "원하는 작업 선택", "옵션 대화 상자", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option,option[0]);
		}
		if( e.getSource() == jbtn4 ) {
			JOptionPane.showMessageDialog(this, "메시지 대화상자");
		}
	}
	public static void main(String[] args) {
		new ActionEventTest();
		
	} 
	
	
}
