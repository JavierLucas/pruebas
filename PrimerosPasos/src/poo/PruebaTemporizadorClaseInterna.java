package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorClaseInterna {
	public static void main(String[] args) {
		Reloj r = new Reloj(4);
		r.iniciar();
		
		JOptionPane.showMessageDialog(null, "Pulse OK para finalizar");
		
		System.exit(0);
	}

	
	
}

class Reloj{
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo) {
		this.intervalo = intervalo;
		
		switch(JOptionPane.showConfirmDialog(null, "¿Desea sonido con el programa?",
				"Sonido", JOptionPane.YES_NO_OPTION)) {
			case 0:sonido = true;break;
			case 1: sonido = false; break;
		}
		
	}
	
	public void iniciar() {
		Accion accion = new Accion();
		Timer t = new Timer(intervalo*1000, accion);
		t.start();
	}
	
	private class Accion implements ActionListener{
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
	
}
