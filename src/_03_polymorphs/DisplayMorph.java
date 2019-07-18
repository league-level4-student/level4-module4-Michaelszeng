package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.imageio.ImageIO;

public class DisplayMorph extends Polymorph {
	BufferedImage image;
	
	void loadImage(String imageFile) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	        } catch (Exception e) {
	            
	        }
	}
	
	
	public DisplayMorph(int x, int y) {
		super(x, y);
		loadImage("dog.png");
	}

	@Override
	public void draw(Graphics g, int x2, int y2, boolean clicked, boolean clicked2) {
		if (clicked && x2 > x && x2 < x+50 && y2 > y && y2 < y+50) {
			ImageObserver o = new ImageObserver() {
				
				@Override
				public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
					// TODO Auto-generated method stub
					return false;
				}
			};
			
			g.drawImage(image, 0, 0, 500, 500, o);
		}
		else {
			g.setColor(Color.orange);
			g.fillRect(x, y, getWidth(), getHeight());
		}
	}
}
