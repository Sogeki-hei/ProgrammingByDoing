// Haruka Kasugano 15/03/2015
import java.awt.*;
import javax.swing.JFrame;

public class Application extends Canvas {
	public void paint(Graphics g) {

		g.setColor(Color.lightGray);
		g.fillOval(150, 150, 300, 300);
		g.setColor(Color.white);
		g.drawOval(150, 150, 300, 300);
		g.drawLine(300, 300, 300, 300);
		g.drawLine(300, 300, 380, 210);
		g.drawLine(300, 300, 350, 380);
		g.drawString("1", 360, 190);
		g.drawString("2", 410, 240);
		g.drawString("3", 430, 310);
		g.drawString("4", 410, 370);
		g.drawString("5", 360, 420);
		g.drawString("6", 300, 440);
		g.drawString("7", 240, 420);
		g.drawString("8", 190, 370);
		g.drawString("9", 170, 310);
		g.drawString("10", 190, 240);
		g.drawString("11", 240, 190);
		g.drawString("12", 300, 170);
	}

	public static void main(String[] args) {
		JFrame win = new JFrame("Clock");
		win.setSize(600, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application canvas = new Application();
		win.add(canvas);
		win.setVisible(true);

	}

}
