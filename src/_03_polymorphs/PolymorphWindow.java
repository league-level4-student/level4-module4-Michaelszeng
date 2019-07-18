package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    int mouseX = 0;
    int mouseY = 0;
    boolean clicked = false;
    boolean clicked2 = false;
    
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
   	 window.addMouseListener(this);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 Polymorph redPoly = new RedMorph(50, 50);
   	 Polymorph bluePoly = new BluePolymorph(280, 430);
   	 Polymorph movePoly = new MovingMorph(20, 90);
   	 Polymorph circlePoly = new CircleMorph(250, 100);
   	 Polymorph mousePoly = new MouseMorph(250, 250);
   	 Polymorph displayPoly = new DisplayMorph(425, 425);
   	 Polymorph messagePoly = new MessageMorph(325, 15);
   	 l.add(redPoly);
   	 l.add(messagePoly);
   	 l.add(bluePoly);
   	 l.add(movePoly);
   	 l.add(circlePoly);
   	 l.add(mousePoly);
   	 l.add(displayPoly);
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 
   	 for (Polymorph p : l) {
   		 p.draw(g, mouseX, mouseY, clicked, clicked2);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for (Polymorph p : l) {
  		 p.update();
  	 }
   	 
    }
    
    public void display() {
    	System.out.println("hi");
    	ImageIcon icon = new ImageIcon("dog.png");
    	JLabel label = new JLabel();
    	label.setIcon(icon);
    	add(label);
    }
    
    public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
	    mouseY = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for (Polymorph p : l) {
	  		 if (p instanceof MessageMorph) {
	  			mouseX = e.getX();
	  		    mouseY = e.getY();
	  			 ((MessageMorph) p).clickEvent(mouseX, mouseY);
	  		 }
	  	 }
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		clicked = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		clicked = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
