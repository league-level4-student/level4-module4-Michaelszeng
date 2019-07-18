package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	
	public MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g, int x2, int y2, boolean clicked, boolean clicked2) {
		g.setColor(Color.green);
		g.fillRect(x, y, getWidth(), getHeight());
	}
	
	public void update() {
		x+=1;
		y+=1;
	}
}
