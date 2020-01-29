package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {
	public static void main(String[] args) {		
		Accion accion = new Accion();	
		String[] options = {"5","10","15","20"};
		int tiempo = JOptionPane.showOptionDialog(null, "Elija tiempo", "ELECCIÓN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
		tiempo = Integer.parseInt(options[tiempo]);
		JOptionPane.showMessageDialog(null, "Ha elegido " + tiempo);
		Timer t = new Timer(tiempo*1000, accion);
		t.start();		
		JOptionPane.showMessageDialog(null, "Presione aceptar para finalizar");
		System.exit(0);
	}

}

class Accion implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		Date fecha = new Date();
		System.out.println("Son las " + fecha );
		Toolkit.getDefaultToolkit().beep();
				
	}
	
}
