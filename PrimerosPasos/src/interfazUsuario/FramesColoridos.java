package interfazUsuario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FramesColoridos {
	public static void main(String[] args) {
		Marco3 m = new Marco3();
		
	}

}

class Marco3 extends JFrame{
	public Marco3() {
		super("Prueba colores");
		setVisible(true);
		setBounds(300, 300, 200, 300);
		
		LaminaColor l = new LaminaColor();
		add(l);
		setBackground(Color.PINK);	
		
	}
	
	
	private class LaminaColor extends JPanel{		
		public void paintComponent(Graphics g) {
			Graphics2D gd = (Graphics2D) g;
			
			
			Rectangle2D r = new Rectangle2D.Double(100,100,100,100);
			gd.setColor(Color.BLUE);
			gd.draw(r);
			gd.fill(r);
			
			gd.setColor(Color.GREEN);
			Ellipse2D e = new Ellipse2D.Double(100, 100, 100, 100);
			gd.fill(e);
			
			
			
		}
	}
}




