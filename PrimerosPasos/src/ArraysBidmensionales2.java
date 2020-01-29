
public class ArraysBidmensionales2 {
	public static void main(String[] args) {
		
		//Vamos a rellenar la matriz en la declaración
		//Es más simple que inicializarlo manualmente indicando la posición que queremos rellenar
		
		int[][] matrix = {
				{10,15,18,19,21},
				{1,5,8,9,1},
				{0,1,8,1,1},
				{10,5,1,9,2},
		};
		
		//Vamos a utilizar el bucle for mejorado
		for(int[]fila:matrix) {
			for(int z:fila ) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
	}

}
