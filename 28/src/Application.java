// Haruka Kasugano 6/3/2015
import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {
	public Frame() {
		setTitle("Frame rocks!");
		setSize(300, 200);
		setLocation(100, 200);
		
		Panel panel = new Panel();
		Container cp = getContentPane();
		cp.add(panel);
	}
}

public class Application {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

class Panel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hi", 75, 100);
	}
}