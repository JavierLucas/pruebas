
public class Matriz_Aleatorios {
	public static void main(String[] args) {
		int[] matriz_aleatorios = new int [150];
		
		//Rellenamos la matriz con numeros aleatorios
		for(int i = 0; i < matriz_aleatorios.length;i++) {
			matriz_aleatorios[i] = (int)Math.round(Math.random() * 100);			
		}
		
		for(int elementos:matriz_aleatorios) {
			System.out.print(elementos + " ");
		}
	}

}
