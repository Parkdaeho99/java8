package day22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JMenuTest extends JFrame{
	JMenuBar jmb;
	JMenu jm1, jm2, jm3;
	JMenuItem item1, item2, item3, item4;
	JPanel jp;
	JTextField jtf;
	
	public JMenuTest() {
		jp = new JPanel();
		jtf = new JTextField();
		jmb = new JMenuBar();
		jm1 = new JMenu("1���޴�");
		jm2 = new JMenu("2���޴�");
		jm3 = new JMenu("3���޴�");
		item1 = new JMenuItem("1��������");
		item2 = new JMenuItem("2��������");
		item3 = new JMenuItem("3��������");
		ActionEvent a  = new ActionEvent(item3, 1, "3��������");
		System.out.println(a.getActionCommand());
//		item3.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				jtf.setText(e.getActionCommand());
//				System.out.println(e.getActionCommand());
//			}
//		});
		
		/*�޴��ٿ� �޴� �߰�*/
		jmb.add(jm1); 
		jmb.add(jm2);
		jmb.add(jm3);
		
		/*�޴��� ������ �߰�*/
		jm1.add(item1);
		jm1.add(item2);
		jm1.add(item3);

		jm2.add(item1);
		jm2.add(item2);
		jm2.add(item3);
		
		jm3.add(item1);
		jm3.add(item2);
		jm3.add(item3);
		
		jp.add(jtf);
		/*�޴��� ����*/
		setJMenuBar(jmb);
		add(jp);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuTest();
	}
}
