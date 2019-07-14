package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph implements MouseMotionListener{
	int x2;
	int y2;
	public MouseMorph(int x, int y) {
		super(x, y);
		
	}
	
	@Override
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, getWidth(), getHeight());
	}
	
	public void update() {
		
	}
	
	public void mouseDragged(MouseEvent e){
	    x = e.getX();
	    y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		x = e.getX();
	    y = e.getY();
	}


}
