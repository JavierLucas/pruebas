package eventos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlandoEstadosVentana {

	public static void main(String[] args) {
		
		Marco4 m = new Marco4();
		Marco4 m1 = new Marco4();
		m1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		m1.setLocation(100, 100);
		m1.setTitle("Soy m1");


	}
}

class Marco4 extends JFrame{
	
	public Marco4() {
		super("Marco de pruebas");
		setBounds(200,200,500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowStateListener(new Oyente());
		
	}
	
	private class Oyente implements WindowStateListener{

		@Override
		public void windowStateChanged(WindowEvent e) {
			switch(e.getNewState()) {
				case Frame.MAXIMIZED_BOTH:
					System.out.println("Se ha maximizado la ventana");
					break;
				case Frame.NORMAL:
					System.out.println("La pantalla se ha vuelto normal");
					break;
				case Frame.ICONIFIED:
					System.out.println("Minimizando");
					break;
				
			}
			
		}
		
	}

	
}
