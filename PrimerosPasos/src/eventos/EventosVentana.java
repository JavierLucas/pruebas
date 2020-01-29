package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosVentana {

	public static void main(String[] args) {
		
		Marco2 m = new Marco2();
		Marco2 m1 = new Marco2();
		m1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		m1.setLocation(100, 100);
		m1.setTitle("Soy m1");


	}
}

class Marco2 extends JFrame{
	
	public Marco2() {
		super("Marco de pruebas");
		setBounds(200,200,500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new Oyente());
		
	}
	
	private class Oyente implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("Ventana cerrada");
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("Ventana minimizada");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("Ventana maximizada");
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("Ventana activada");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Ventana desactivada");
			
		}
		
	}
	
}
