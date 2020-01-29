package interfazUsuario;

import java.awt.Frame;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
		Marco miMarco = new Marco();

	}

}

class Marco extends JFrame {
	public Marco() {
		//Para que el marco sea visible
		setVisible(true);
		//Para proporcionar un tamaño al marco
		setSize(300, 500);
		//Indicar comportamiento del programa al cerrarse la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setLocation(500, 250);
		setBounds(500, 250, 300, 400);
		setResizable(false);
		
		//Para maximizar la ventana
		setExtendedState(Frame.MAXIMIZED_BOTH);
		
		
	}
	
}
