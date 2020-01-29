import java.util.*;
public class Condicionales1 {

	public static void main(String[] args) {
		final int mayorEdad = 18;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor: ");
		int edad = entrada.nextInt();
		if (edad >= mayorEdad){
			System.out.println("Eres mayor de edad");
		}
		else{
			System.out.println("Eres menor de edad");
		}

	}

}
