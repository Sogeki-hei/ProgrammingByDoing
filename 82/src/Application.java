// Haruka Kasugano 15/03/2015
import java.awt.*;
import javax.swing.JFrame;

public class Application extends Canvas
{
    public void paint( Graphics g )
    {
        // lines
        g.setColor(Color.green);
        g.drawLine(10,100,400,100); // x^1 Coordinate, y^1 Coordinate, x^2 Coordinate, y^2 Coordinate
        g.setColor(Color.blue);
        g.drawLine(50,150,100,180);
        g.setColor(Color.magenta);
        g.drawLine(100,350,300,230);
        g.setColor(Color.red);
        g.drawLine(100,30,100,150);
        g.drawLine(300,230,230,120);

        g.setColor(Color.black);

        // fonts
        g.drawString("Graphics are pretty neat.", 500, 100);
        g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
        g.drawString("Yes, they are.", 400, 200);

        g.setColor(Color.white);
        g.setFont(new Font("Haettenschweiler", Font.BOLD+Font.ITALIC, 60)); // 60-pt italic bold
        g.drawString("Leander Lions", 300, 350);

        g.setColor(Color.blue);
        g.setFont(Font.decode("Haettenschweiler-BOLDITALIC-60")); // a different way to specify the same font
        g.drawString("Leander Lions", 290, 360);
        
        g.setColor(Color.black);
        g.setFont(new Font(null)); // restore default font

        int x=400, y=490;
        g.drawRect(x,y,150,20); // lower-left for x and y
        g.drawString("Where is the starting point?", x,y);
        g.setColor(Color.red);
        g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Application canvas = new Application();
        win.add( canvas );
        win.setVisible(true);
    }
}