package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    int mouseX = 500;
    int mouseY = 500;
    
    ArrayList<Polymorph> l = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.addMouseMotionListener(this);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 Polymorph redPoly = new RedMorph(50, 50);
   	 Polymorph bluePoly = new BluePolymorph(280, 430);
   	 Polymorph movePoly = new MovingMorph(20, 90);
   	 Polymorph circlePoly = new CircleMorph(250, 100);
   	 Polymorph mousePoly = new MouseMorph(250, 250);
   	 l.add(redPoly);
   	 l.add(bluePoly);
   	 l.add(movePoly);
   	 l.add(circlePoly);
   	 l.add(mousePoly);
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 
   	 for (Polymorph p : l) {
   		 p.draw(g, mouseX, mouseY);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for (Polymorph p : l) {
  		 p.update();
  	 }
   	 
    }
    
    public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		int mouseX = e.getX();
	    int mouseY = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
