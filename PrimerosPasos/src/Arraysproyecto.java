
public class Arraysproyecto {
	public static void main(String[] args) {
		//Vamos a calcula los intereses sobre una cuenta a lo largo de varios años
		double acumulado;
		double interes = 0.1;
		double[][] saldo = new double[6][5];
		
		//Rellenamos las matrices
		for(int i = 0; i < 6; i++) {
			//Almacenamos en primera dimensión el valor fijo
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			//Empezamos en 1, porque para todas las posiciones el valor 0 ya está iniciado por nuestro bucle anterior
			for(int j = 1; j < 5; j++) {
				acumulado = acumulado + acumulado * interes;
				saldo[i][j] = acumulado;
				
			}
			interes += 0.01;
		}
		
		for(double[] filas:saldo) {
			for(double x:filas) {
				System.out.printf("%1.2f", x);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
