import javax.swing.*;


public class formatearNumeros {

	public static void main(String[] args) {
		double x = 10000.0;
		
		//utilizamos printf, imprimir con formato
		//2 hace referencia a los decimales
		
		System.out.printf("%1.4f",x/3);
		
		//Vamos a pedir número por pantalla, calculamos su raíz y redondeamos resultado
		String number = JOptionPane.showInputDialog("Introduce un número: ");
		double numberConverted = Double.parseDouble(number);
		double resultado = Math.sqrt(numberConverted);
		System.out.println();
		System.out.print("El resultado de la operación indicada es: ");
		System.out.printf("%1.3f", resultado);
		
		
		
		
	}

}
