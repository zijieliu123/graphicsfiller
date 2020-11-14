// filler code for pong provided by Mr. David

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoopGraphicsFiller extends JPanel {
	
	// constants that are predefined and won't change as the program runs
	private final int WIDTH = 1000, HEIGHT = 590;


	
	// defines what we want to happen anytime we draw the graphics
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// call your methods here
		public void circles(int n) {
			
			for (int i = 0; i < n; i++) {
				g.fillOval(2*100, 2*100, 100, 100);
				
			}
			
		}
		
		public void growingsphere(int width, int height) {
			width = 50;
			height = 50;
			
			for (int i = 1; i < 5; width += 10, height += 10) {
				
				g.filloval(2*100, 2*100, width, height);
				
			}
			
			int i = 5;
			while (i < 10) {
				width -= 10;
				height -= 10;
				g.filloval(2*100, 2*100, width, height);
			}
			
		}
		public void tenrowscircles() {
			
			for (int row = 0; row < 10; row++) {
				for (int column = 0; column < 10; column++) {
					
					g.fillOval(2*100, 2*100, 50, 50);
					
				}
				
			}
			
		}
		
		public void columnrect() {
			int color1 = 20;
			int color2 = 20;
			int color3 = 20;
			
			for (int row = 0; row < 5; row++) {
				for (int column = 0; column < 5; column++) {
					
					g.fillrect(2*100, 2*100, 50, 50);
					g.setColor(color1 += 10; color2 += 10; color3 += 10);
				}
				
			}
			
		}
		
		public void weirdcircle() {
			int x = 100;
			int y = 100;
			for (int i = 1; i < 4; i++) {
				
				g.filloval(x += 10, y += 10, 100, 100);
				
			}
			
		}
		
		
		

				
					
	}

	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual program.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws
			//repaint();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new GraphicsLoops();
	}
 
	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public LoopGraphicsFiller() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		this.setFocusable(true);
		
		run();
	}
}