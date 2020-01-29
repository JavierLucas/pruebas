package interfazUsuario;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marcos2 {
	public static void main(String[] args) {
		Marco2 m = new Marco2();
	}
	

}

class Marco2 extends JFrame{
	public Marco2() {
		super("prueba");
		setVisible(true);
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		//setSize(d.height/2,d.width/2);
		setBounds(d.width/4, d.height/4, d.width/2, d.height/2);
		Image i = Toolkit.getDefaultToolkit().getImage("src/interfazUsuario/graficos/icono.jpg");
		setIconImage(i);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
