// Haruka Kasugano 15/03/2015
import java.awt.*;
import javax.swing.JFrame;

public class Application extends Canvas {
	public void paint(Graphics g) {

		g.setColor(Color.green);
		g.fillOval(100, 100, 150, 150);
	}

	public static void main(String[] args) {
		JFrame win = new JFrame("Circle");
		win.setSize(400,400);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application canvas = new Application();
		win.add(canvas);
		win.setVisible(true);
	}

}
