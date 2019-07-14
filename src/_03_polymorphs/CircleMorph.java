package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	private int t = 0;
	public CircleMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.pink);
		g.fillRect(x, y, getWidth(), getHeight());
		
	}
	
	public void update() {
		t+=1;
		x = (int) (x+150*Math.cos(180*t/Math.PI));
		y = (int) (y+150*Math.sin(180*t/Math.PI));
	}
	
}
