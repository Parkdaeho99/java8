package day22;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{
	int a1;
	
	public BorderLayoutTest() {
		super("보더 레이아웃");
//		super.setTitle("Asd");
//		this.setTitle("Asd");
		/*JFrame 객체에 String을 매개변수로 넘긴다*/
		/*JFrame이 인스턴스화 될 때 생성자가 실행되고, 매개변수로 받은 String값을 
		 * setTitle()로 넘겨 타이틀을 설정한다.*/

		this.add("North", new Button("North"));
		/*super는 프레임이라서 add가 될 수 있다. 그런데
		 * this는 BorderLayoutTest라서 프레임이 아니지 않나?*/
		super.add(BorderLayout.EAST, new Button("East"));
		/*BorderLayoutTest가 인스턴스화 될 때 JFrame이 먼저 인스턴스화한다*/
		/*this는 BorderLayoutTest의 객체를 가르키고*/
		/*super는 JFrame의 객체를 가르킨다*/
		/*this.add는 BorderLayoutTest의 객체에 추가하는 거고*/
		/*super.add는 JFrame의 객체에 추가하는 거다.*/
		/*this.add랑 super.add, 그 어디에 해도 출력된다. 왜? 차이가 뭐지?*/
		
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

