import javax.swing.*;
public class entradaSalidaII {

	public static void main(String[] args) {
		String nombreUsuario = JOptionPane.showInputDialog("Introduce su nombre: ");
		
		//este m�todo devuelve siempre un string
		String edad = JOptionPane.showInputDialog("Introduce la edad por favor: ");
		System.out.println("Hola " + nombreUsuario + " tienes " + edad + " a�os");
		//si queremos convertir el string a un tipo int
		int edadUsuario = Integer.parseInt(edad);
		System.out.println("El a�o que viene tendr�s " + (edadUsuario + 1));
		

	}

}
