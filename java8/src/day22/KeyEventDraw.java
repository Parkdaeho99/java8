package day22;

import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyEventDraw {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		TextField tf = new TextField();
		tf.setEnabled(false);
		f.add(tf);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(java.awt.event.KeyEvent e) {
				System.out.println("ŰŸ�Ե�");
				int key = e.getKeyChar();
				tf.setText(String.valueOf((char)key));
				System.out.println("ŰŸ�Ե� ��");
			}
			
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				System.out.println("Ű�������");
				int key = e.getKeyCode();
				String temp = tf.getText();
				tf.setText(temp+" : "+ KeyEvent.getKeyText(key));
				System.out.println("Ű������峡");
				
			}
			
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
			}
		});
	}
}
