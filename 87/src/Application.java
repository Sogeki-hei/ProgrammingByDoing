// Haruka Kasugano 15/03/2015
import java.awt.*;
import javax.swing.*;

public class Application extends Canvas{
	public void paint(Graphics g) {
		
		Polygon tri = new Polygon();
		tri.addPoint(200,300);
		tri.addPoint(100,500);
		tri.addPoint(300,500);
		
		Color purple = new Color(204,51,255);
		g.setColor(purple);
		g.fillPolygon(tri);
	}
	public static void main(String[] args) {
		JFrame win = new JFrame("A fucking boring triangle");
		win.setSize(600, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new Application());
		win.setVisible(true);
	}

}
