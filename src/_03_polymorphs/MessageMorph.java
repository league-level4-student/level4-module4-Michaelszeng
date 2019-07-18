package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph{
	public MessageMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g, int x2, int y2, boolean clicked, boolean clicked2) {
		g.setColor(Color.cyan);
		g.fillRect(x, y, 50, 50);
	}
	
	public void clickEvent(int x2, int y2) {
		if (x2 > x && x2 < x+50 && y2 > y && y2 < y+50) {
			JOptionPane.showMessageDialog(null, "nice, you clicked me");
			
		}
	}
}
