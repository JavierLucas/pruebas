import javax.swing.*;


public class formatearNumeros {

	public static void main(String[] args) {
		double x = 10000.0;
		
		//utilizamos printf, imprimir con formato
		//2 hace referencia a los decimales
		
		System.out.printf("%1.4f",x/3);
		
		//Vamos a pedir n�mero por pantalla, calculamos su ra�z y redondeamos resultado
		String number = JOptionPane.showInputDialog("Introduce un n�mero: ");
		double numberConverted = Double.parseDouble(number);
		double resultado = Math.sqrt(numberConverted);
		System.out.println();
		System.out.print("El resultado de la operaci�n indicada es: ");
		System.out.printf("%1.3f", resultado);
		
		
		
		
	}

}
