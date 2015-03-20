// Haruka Kasugano 15/03/2015
import java.awt.*;
import javax.swing.JFrame;

public class Application  extends Canvas{
	public void paint ( Graphics g ) {
		g.setColor(Color.black);
		
		g.drawRect(50,20,100,200);
		g.drawOval(160,20,100,200);
		
		g.drawArc(270,20,100,200,0,270);
		
		g.drawArc(50,250,150,150,90,180);
		g.drawArc(210,250,150,150,45,90);
		g.fillArc(210, 280, 150, 150, 45, 90);
		
		g.setColor(Color.yellow);
		g.fillArc(150, 400, 150, 150, 45, 270);
		
		g.setColor(Color.pink);
		g.fillArc(250, 370, 150, 150, 135, -270);
		
		Color myOrange = new Color(230,92,0);
		
		g.setColor(myOrange);
		g.fillOval(500,50,150,150);
		
		Color myGrey = new Color(238,238,238);
		g.setColor(myGrey);
		g.fillOval(550, 100, 50, 50);
		
		g.setColor(Color.yellow);
		g.fillOval(500, 210,150,150);
		
		g.setColor(Color.green);
		g.fillOval(500, 370, 150, 150);
		
	}
	public static void main(String[] args) {
	    JFrame win = new JFrame("GraphicsDemo2: Arcs and Colors");
	    win.setSize(800,600);
	    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Application canvas = new Application();
	    win.add( canvas );
	    win.setVisible(true);
    }

}
