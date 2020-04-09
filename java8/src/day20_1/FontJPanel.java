package day20_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FontJPanel extends JPanel{
	Font sansPlain, serifBold, monoItalic ,serifBoldI;
	String param;
	
	public void init() { // 폰트 만들기
		serifBold = new Font("Serif", Font.BOLD, 10);
		serifBoldI = new Font("Serif", Font.BOLD+Font.ITALIC, 13);
		sansPlain = new Font("SansSerif", Font.PLAIN, 16);
		monoItalic = new Font("Monospaced", Font.ITALIC, 20);
		
	}

	public void paint(Graphics g) { //패널에서 실행될 것
		g.setFont(serifBold); //폰트설정
		param = "Font name=Serif, style=BOLD, size=10"; //스트링 설정
		g.drawString(param, 10, 10); //그려라
		
		g.setFont(serifBoldI);
		param = "Font name=Serif, style=BOLD+ITALIC, size=13";
		g.drawString(param, 10, 50);
		
		g.setFont(sansPlain);
		param = "Font name=SansSerif, style=PLAIN, size=16";
		g.drawString(param, 10, 90);
		
		g.setColor(Color.blue);
		g.setFont(monoItalic);
		param = "Font name=Monospaced, style=ITALIC, size=20";
		g.drawString(param, 10, 130);
		
		
	}
}
