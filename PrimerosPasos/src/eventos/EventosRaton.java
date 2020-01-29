package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {
	public static void main(String[] args) {
		//System.out.println("Estoy dentro del programa");
		MarcoRaton m = new MarcoRaton();
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(100,100,200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(new Oyente());
		addMouseMotionListener(new Oyente());
	}
	
	
	class Oyente implements MouseListener, MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Has hecho clic en la coordenada " + e.getX() + " " + e.getY());
			if(e.getClickCount() > 1) {
				System.out.println("Llevas " + e.getClickCount());
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("El ratón ha entrado en zona");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("El ratón ha salido de zona");
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("El ratón se ha arrastrado a " + e.getX() + " " + e.getY());
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println("El ratón se ha movido a " + e.getX() + " " + e.getY());
			
		}
		
	}
}
