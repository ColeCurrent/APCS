import javax.swing.JFrame;
import java.awt.Graphics;

public class Game extends JFrame{
	//Constructor
	public Game() {
		setBounds(0, 0, 500, 400);
		setVisible(true);
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
	}
	
	//Main Method
	public static void main(String[] args) {
		new Game();
		System.out.println("hello");

	}

}