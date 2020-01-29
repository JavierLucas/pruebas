import java.util.Scanner;


public class entradaSalidaDatos {

	public static void main(String[] args) {
		String nombreUsuario;
		int edad;
		// Construimos objeto tipo scanner
		//en el constructor, como source file utilizaremos system.in (la consola)
		Scanner entrada = new Scanner(System.in);
		//imprimos mensaje por pantalla
		System.out.println("Introduzca su nombre, por favor: ");
		nombreUsuario = entrada.nextLine();
		System.out.println("Introduzca su edad, por favor: ");
		edad = entrada.nextInt();
		
		System.out.println("El nombre introducido ha sido: " 
				+ nombreUsuario + " Su edad es: " + edad);
		

	}

}
