package day22;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{
	int a1;
	
	public BorderLayoutTest() {
		super("���� ���̾ƿ�");
//		super.setTitle("Asd");
//		this.setTitle("Asd");
		/*JFrame ��ü�� String�� �Ű������� �ѱ��*/
		/*JFrame�� �ν��Ͻ�ȭ �� �� �����ڰ� ����ǰ�, �Ű������� ���� String���� 
		 * setTitle()�� �Ѱ� Ÿ��Ʋ�� �����Ѵ�.*/

		this.add("North", new Button("North"));
		/*super�� �������̶� add�� �� �� �ִ�. �׷���
		 * this�� BorderLayoutTest�� �������� �ƴ��� �ʳ�?*/
		super.add(BorderLayout.EAST, new Button("East"));
		/*BorderLayoutTest�� �ν��Ͻ�ȭ �� �� JFrame�� ���� �ν��Ͻ�ȭ�Ѵ�*/
		/*this�� BorderLayoutTest�� ��ü�� ����Ű��*/
		/*super�� JFrame�� ��ü�� ����Ų��*/
		/*this.add�� BorderLayoutTest�� ��ü�� �߰��ϴ� �Ű�*/
		/*super.add�� JFrame�� ��ü�� �߰��ϴ� �Ŵ�.*/
		/*this.add�� super.add, �� ��� �ص� ��µȴ�. ��? ���̰� ����?*/
		
		add(new Button("Center"), BorderLayout.CENTER);
		add(new Button("South"), BorderLayout.SOUTH);
		add(new Button("West"), BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayoutTest blt = new BorderLayoutTest();
		blt.add(new Button("Center"), BorderLayout.CENTER);
		blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}

