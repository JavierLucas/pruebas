import java.util.*;

public class BuclesAdivinaNúmero {

	public static void main(String[] args) {		
		
		//para generar número aleatorio utilizamos math.random()
		int aleatorio = (int)(Math.round(Math.random()*100));
		//utilizamos consola para insertar datos
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;

		
		while(numero != aleatorio){
			intentos++;
			System.out.println("Introduzca un número: ");
			numero = entrada.nextInt();
			//Comprobamos si el número introducido es igual al aleatorio			
			if (numero > aleatorio){
				System.out.println("Prueba con un número más pequeño");				
			}
			else if (numero < aleatorio){
				System.out.println("Prueba con un número más alto");
			}
			else{
				System.out.println("HAS ACERTADO!!!!");
			}
		}
		
		System.out.println("Has utilizado un total de " + intentos + " intentos");
	}
	


}
