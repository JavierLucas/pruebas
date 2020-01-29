package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {
	public static void main(String[] args) {
		FrameTeclado f = new FrameTeclado();
		
	}

}

class FrameTeclado extends JFrame{
	public FrameTeclado() {
		super("Teclado");
		setVisible(true);
		setBounds(100,200,200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(new Oyente());
	}
	
	class Oyente implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.print(e.getKeyChar());
			
		}
		
	}
}
