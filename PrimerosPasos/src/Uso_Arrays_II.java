//Para utilizar joptionpane
import javax.swing.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		
		//Forma extensa para inicializar matrices
		String[]paises = new String[8];		
		/*
		paises[0] = "Espa�a";
		paises[1] = "M�xico";
		paises[2] = "Colombia";
		paises[3] = "Per�";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		*/
		
		//Forma simplificada para inicializar matrices
		//String[]paises = {"Espa�a", "M�xico", "Colombia", "Per�", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		/*for(int i = 0; i < paises.length; i++) {
			System.out.println("Pa�s " + (i+1) + " " + paises[i]);
		}*/
		
		//Vamos a rellenar la matriz utilizando showinputdialog
		for(int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce pa�s" + (i + 1));
		}
		//Para el bucle for each declaramos una variable del mismo tipo que la matriz
		for (String elemento:paises) {
			System.out.println("Pa�s: " + elemento);
		}

	}

}
