import java.util.Scanner;

import javax.swing.JOptionPane;


public class CondicionalesCalculoArea {

	public static void main(String[] args) {
		//Vamos a crear un programa que sea capaz de calcular diversas �reas
		int opcionNum;
		int area = 0;
		boolean error = false;
		Scanner entrada = new Scanner(System.in);
		String opcion = JOptionPane.showInputDialog("Introduzca una opci�n." + '\n' +  "1: cuadrado" + '\n' + "2"
				+ ":rect�ngulo" + '\n' +  "3: tri�ngulo" + '\n' + "4: c�rculo");	
		opcionNum = Integer.parseInt(opcion);
		
		switch(opcionNum){
		//Cuadrado
			case 1:
				System.out.println("Has elegido CUADRADO. Introduce el lado: ");
				int lado = entrada.nextInt();
				area = (int)Math.pow(lado, 2);
				break;
			case 2:
				System.out.println("Has elegido el rect�ngulo. Introduce base y altura: ");
				int base = entrada.nextInt();
				int altura = entrada.nextInt();
				area = base * altura;
				break;
			case 3:
				System.out.println("Has elegido TRI�NGULO. Introduce base y altura: ");
				int baset = entrada.nextInt();
				int alturat = entrada.nextInt();
				area = baset * alturat / 2;		
				break;
			default:
				System.out.println("NO HA ELEGIDO UNA OPCI�N V�LIDA");
				error = true;
				break;
					
		}
		if (!error){
			System.out.println("El �rea del pol�gono elegido es: " + area);			
		}	
		

	}

}
