
public class CadenasCaracteres {

	public static void main(String[] args) {
		String nombre = "Pepe Luis";
		
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		//Para mostrar la última letra
		int ultimaLetra;
		ultimaLetra = nombre.length();
		System.out.println("La última letra es " + nombre.charAt(ultimaLetra - 1));
		
		//extraemos determinado número de caracteres de una cadena
		String frase = "Hoy es un estupendo dia para aprender a programar Java";
		//vamos a mostra únicamente una parte con substream
		String fraseResumen = frase.substring(0,28);
		System.out.println(fraseResumen + " irnos a la playa y olvidarnos de todo...");
		
		
		//equals: devuelve true si son iguales y false en caso contrario
		String cadena1 = "prueba";
		String cadena2 = "pruebas";
		
		System.out.println(cadena1.equals(cadena2));

	}

}
