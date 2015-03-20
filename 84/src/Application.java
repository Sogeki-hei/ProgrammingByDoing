// Haruka Kasugano 15/03/2015
import java.awt.*;
import javax.swing.JFrame;

public class Application extends Canvas {
	public void paint(Graphics g) {

		g.setColor(Color.yellow);
		g.fillOval(100, 100, 150, 150);
		g.setColor(Color.blue);
		g.fillOval(190, 140, 20, 20);
		g.fillOval(140, 140, 20, 20);
		g.setColor(Color.red);
		g.fillArc(135, 170, 80, 60, 180, 180);
		
		// labels
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
		    g.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
		    g.drawString( String.valueOf(Y), 28, Y );
		// lines
		g.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
		    g.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
		    g.drawLine(0,Y,799,Y);    // vertical
	}

	public static void main(String[] args) {
		JFrame win = new JFrame("Smiley");
		win.setSize(400, 400);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application canvas = new Application();
		win.add(canvas);
		win.setVisible(true);
	}

}
