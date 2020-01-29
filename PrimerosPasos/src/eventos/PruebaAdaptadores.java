package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaAdaptadores {

	public static void main(String[] args) {
		
		Marco3 m = new Marco3();
		Marco3 m1 = new Marco3();
		m1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		m1.setLocation(100, 100);
		m1.setTitle("Soy m1");


	}
}

class Marco3 extends JFrame{
	
	public Marco3() {
		super("Marco de pruebas");
		setBounds(200,200,500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new Oyente());
		
	}
	
	private class Oyente extends WindowAdapter{
		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Se ha desactivado la pestaña");
			
		}
		
	}

	
}
