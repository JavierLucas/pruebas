//Para utilizar joptionpane
import javax.swing.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		
		//Forma extensa para inicializar matrices
		String[]paises = new String[8];		
		/*
		paises[0] = "España";
		paises[1] = "México";
		paises[2] = "Colombia";
		paises[3] = "Perú";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		*/
		
		//Forma simplificada para inicializar matrices
		//String[]paises = {"España", "México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		/*for(int i = 0; i < paises.length; i++) {
			System.out.println("País " + (i+1) + " " + paises[i]);
		}*/
		
		//Vamos a rellenar la matriz utilizando showinputdialog
		for(int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce país" + (i + 1));
		}
		//Para el bucle for each declaramos una variable del mismo tipo que la matriz
		for (String elemento:paises) {
			System.out.println("País: " + elemento);
		}

	}

}
