package numberGame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//public class FrameGUI extends JPanel{
//	public FrameGUI(){
//	 GameBoard gam = new GameBoard();
//     NumberTile[][] board = gam.getBoard();
//}
     
    
	import javax.swing.*;
	import java.awt.*;
 
 
 
//     JFrame jf = new JFrame();
//    FrameGUI game = new FrameGUI();
//     
//     int width=1200;
//     int height = width/16*9;
//     
//     jf.setSize(width, height);
//     jf.setResizable(false);
//     jf.add(game);
//     jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
//     jf.setVisible(true);
//     jf.setTitle("Number Game");
//     
//     	Container pane = jf.getContentPane();
//     	
//     	JButton button = new JButton("Button 1 (PAGE_START)");
//     	
//     	Graphics2D graphics =null;
//      
//     	
//     	button = new JButton("game");
//     	button.setPreferredSize(new Dimension(200, 100));
//		graphics.draw(new Line2D.Double(0, 0, 30, 40));
//     	pane.add(button, BorderLayout.CENTER);
//     	Object g2;
//
//     
//     	
//     	button = new JButton("Long-Named Button 4 (PAGE_END)");
//        
//
//     	button = new JButton("SCORE");
//     	pane.add(button, BorderLayout.LINE_END);
//     
	public class FrameGUI{
	    private Frame f;
	    	    private Panel p;
	    	    private Panel p2;
	    	     
	    	    public FrameGUI(){
	    	        f = new Frame("Code 2 Learn");
	    	        p=new Panel();
	    	        p2=new Panel();
	    	    }
	    	     
	    	    public void launchMyFrame(){
	    	    	f.setSize(300,300);
	    	        f.setLayout(null); //Override the default layout manager
	    	         
	    	        p.setSize(300, 300);
	    	        p2.setSize(400,250);
	    	        p.setBackground(Color.BLACK);
	    	        p2.setBackground(Color.BLUE);
	    	        f.add(p);
	    	        f.add(p2);
	    	        f.setVisible(true);
	    	    }
	   	     
	    	    public static void main(String args[]){
	    	        FrameGUI fe=new FrameGUI();
	    	        fe.launchMyFrame();
	    	    
 
     
 
 
 }
 
 
 

 
}

