package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph {
	public MouseMorph(int x, int y) {
		super(x, y);
		
	}
	
	@Override
	public void draw(Graphics g, int x, int y, boolean clicked, boolean clicked2) {
		g.setColor(Color.yellow);
		g.fillRect(x-30, y-30, getWidth(), getHeight());
	}
	
	public void update() {
		
	}


}
