
public class Math1 {

	public static void main(String[] args) {
		//Vamos a calcular la ra�z cuadrada de un n�mero
		//sqrt devuelve un double. Habr� que almacenarlo en un double o hacer un cast
		int redondeo;
		int num = 15;
		double raiz = Math.sqrt(num);
		double resultado;
		double exponente = 3;
		double base = 5;
		redondeo = (int)Math.sqrt(num);
		System.out.println("El resultado de la ra�z es " + raiz);
		System.out.println(redondeo);
		//al utilizar round hay que tener en cuenta c�mo funciona: 
		//float - int; double - long
		redondeo = (int)Math.round(Math.sqrt(num));
		System.out.println(redondeo);
		resultado = Math.pow(base, exponente);
		System.out.println(resultado);

	}

}
