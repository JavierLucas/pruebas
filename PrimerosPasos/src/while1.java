
import javax.swing.*;
public class while1 {

	public static void main(String[] args) {
		//Programa acceso con contraseña a programa.
		
		final String clave = "Javier";
		String introducida;
		boolean claveCorrecta = false;
		
		while(!claveCorrecta){
			introducida = JOptionPane.showInputDialog("Introduce la contraseña");
			if(clave.equals(introducida)){
				claveCorrecta = true;
			}
		}
	}

}
