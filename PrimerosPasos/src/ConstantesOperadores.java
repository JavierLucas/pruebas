
public class ConstantesOperadores {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		//Como es una constante no podremos cambiar su valor a lo largo del programa
		final int dia = 7;
		boolean l;
		if (a == b){
			l = true;
		}
		else{
			l = false;
		}
		int c = a+b;
		//Incrementamos c en 1 unidad
		c++;
		
		
		//Incrementamos c en 5 unidades
		c += 5;
		System.out.println("El resultado de la operación es: " + c);
		System.out.println(l);
		//Cast para conseguir que el resultado sea un decimal
		System.out.println((float)b/a);

	}

}
