package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Ejemplo del temporizador realizado con una clase interna
 * @author javie
 *
 */
public class PruebaTemporizadorClaseInternaLocal {
	public static void main(String[] args) {
		Reloj2 r = new Reloj2();
		r.iniciar(3,true);
		
		JOptionPane.showMessageDialog(null, "Pulse OK para finalizar");
		
		System.exit(0);
	}

	
	
}

class Reloj2{
	
	public void iniciar(final int intervalo, final boolean sonido) {
		 class Accion implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				System.out.println("Fecha cada " + intervalo + " segundos: " + d);
				if(sonido) {
					//JOptionPane.showMessageDialog(null, "Ha elegido programa con sonido");
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		Accion accion = new Accion();
		Timer t = new Timer(intervalo*1000, accion);
		t.start();
	}
	

	
}