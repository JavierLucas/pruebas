package interfazUsuario;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoenMarco {

	public static void main(String[] args) {
		crearMarco c = new crearMarco();

	}
	
	


}

class crearMarco extends JFrame{
	public crearMarco() {
		super("prueba");
		setVisible(true);
		setBounds(400,400,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lamina l = new Lamina();
		add(l);
		//setResizable(false);
	}
	
	private class Lamina extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Estamos aprendiendo a utilizar este programa",
					100, 100);
			g.drawRect(50, 50, 20, 20);
			g.drawArc(20, 60, 80, 80, 120, 130);
			
			try {
				imagen = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1920px-Image_created_with_a_mobile_phone.png"));
				g.drawImage(imagen, 10, 10, null);
				
			} catch (MalformedURLException e) {
				System.err.println("Se ha producido un error");
			} catch (IOException e) {
				System.err.println("Se ha producido un error");
			}
		}
		Image imagen;
	}
	
}


