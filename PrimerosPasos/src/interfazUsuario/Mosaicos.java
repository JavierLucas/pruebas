package interfazUsuario;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mosaicos {

	public static void main(String[] args) {
		String[] options = {"círculo","unicornio", "rombo"};
		ImageIcon icon = new ImageIcon("src/interfazUsuario/graficos/icono.png");
		System.out.println("hola");
		int eleccion =   JOptionPane.showOptionDialog(null, "Elija mosaico", 
				"Eleccion mosaico", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, icon, options, null);
		MarcoM m = new MarcoM(eleccion);
	}
}



class MarcoM extends JFrame{
	public MarcoM(int tipo) {
		super("Mosaico");
		setBounds(100,100,400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Lamina(tipo));
	}

	
	class Lamina extends JPanel{
		
		private int tipo;
		
		public Lamina(int tipo) {
			this.tipo = tipo;
		}
		
		public void paintComponent(Graphics g) {
			Image imagen;
			String ruta = "src/interfazUsuario/graficos/";
			
			super.paintComponent(g);
			
			if(tipo == 0) {
				ruta+="circulo.png";				
			}
			else if(tipo == 1) {
				ruta+="icono.jpg";
			}
			else {
				ruta+="rombo.jpg";
			}
			
			try {
				imagen = ImageIO.read(new File(ruta));
				imagen = imagen.getScaledInstance(25, 25, Image.SCALE_DEFAULT);
				g.drawImage(imagen, 0, 0, null);
				for(int i = 0; i < 400; i++) {
					for(int j = 0; j < 400; j++) {
						g.copyArea(0, 0, imagen.getWidth(null), imagen.getHeight(null), i*imagen.getWidth(null)
								, j*imagen.getHeight(null));
					}
				}
			} catch (IOException e) {
				System.err.println("Se ha producido un error con el archivo");
			}
			
			
		}
		

	}
	
}
