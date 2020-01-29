package eventos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio1 {

	public static void main(String[] args) {
		Marco m = new Marco();

	}

}

class Marco extends JFrame{
	/**
	 * Constructor
	 * Se encarga de establecer las dimensiones, localización, visibilidad, closeoperation y de añadir lámina
	 */
	public Marco() {
		super("Eventos y botones");
		setVisible(true);
		setBounds(700, 300, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Lamina());
		
		
	}
}

class Lamina extends JPanel implements ActionListener{
	JButton azul = new JButton("Azul");
	JButton amarillo = new JButton("Amarillo");
	JButton rojo = new JButton("Rojo");
	
	public Lamina() {
		add(azul);
		add(amarillo);
		add(rojo);
		
		azul.addActionListener(this);
		amarillo.addActionListener(this);
		rojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object pulsado = e.getSource();
		
		if(pulsado == azul) {
			setBackground(Color.BLUE);
		}
		else if(pulsado == amarillo) {
			setBackground(Color.YELLOW);
		}
		else {
			setBackground(Color.RED);
		}
		
		Toolkit.getDefaultToolkit().beep();
		
	}
}
