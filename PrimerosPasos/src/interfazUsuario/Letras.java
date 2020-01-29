package interfazUsuario;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Letras {

	public static void main(String[] args) {
		MarcoLetras m = new MarcoLetras();
		
		String [] nombres = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String fuente:nombres) {
			System.out.println(fuente);
		}

		
	}
	


}

class MarcoLetras extends JFrame{
	public MarcoLetras() {
		setBounds(200, 200, 200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Lamina l = new Lamina();
		add(l);
	}
	
	class Lamina extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D gd = (Graphics2D) g;
			
			gd.setFont(new Font("Arial Black", Font.BOLD, 23));
			gd.setColor(Color.RED);
			gd.drawString("Hola esto es prueba", 100, 100);
			
			try {
				
				imagen = ImageIO.read(new File("src/interfazUsuario/graficos/coche.png"));
				gd.drawImage(imagen, 5, 5, null);
				
			} catch (IOException e) {
				System.err.println("No se ha encontrado la imagen");
				
			}
			
			
		}
		
		Image imagen;
	}
}
