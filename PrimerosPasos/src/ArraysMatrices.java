
public class ArraysMatrices {
	public static void main(String[] args) {
		
		//Declaración (unos corchetes por cada dimensión)
		int [][] matrix = new int[4][5];
		
		//Rellenamos la matriz con numeros aleatorios del 0 al 20
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = (int)(Math.random()*20);
			}
		}	
		
		//Mostramos la matriz: utilizamos bucles anidados
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("Valor almacenado en posición [" + i + "] [" + j + "]: " + matrix[i][j]);
			}
		}	
		
		//Mostramos la información en forma de tabla
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
		
	}

}
