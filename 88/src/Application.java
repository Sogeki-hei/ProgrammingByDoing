// Haruka Kasugano 15/03/2015
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Application extends Canvas {
	public void paint(Graphics g) {

		Random rm = new Random();
		int x, y, red, green, blue;
		Polygon tri = new Polygon();
		for ( int i = 0; i <= 500; i++) {
			x = rm.nextInt(600);
			y = rm.nextInt(600);
			red = rm.nextInt(255);
			green = rm.nextInt(255);
			blue = rm.nextInt(255);
			tri.addPoint(x, y);
			tri.addPoint(x, y);
			tri.addPoint(x, y);

			Color Random = new Color(red, green, blue);
			g.setColor(Random);
			g.fillPolygon(tri);
		}
	}

	public static void main(String[] args) {

		JFrame win = new JFrame("Drawing Random Triangles");
		win.setSize(600, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new Application());
		win.setVisible(true);
	}

}
