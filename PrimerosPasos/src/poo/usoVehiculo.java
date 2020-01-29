package poo;

import java.util.Scanner;

public class usoVehiculo {

	public static void main(String[] args) {
		Coche Renault = new Coche(); //instanciar una clase. renault es un ejemplar de una clase
		//No podemos hacerlo de esta manera porque rueda es privado
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas");
		System.out.println(Renault.getLargo());
		
		//-------------------------------------------------
		Coche miCoche = new Coche();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el color de tu coche: ");
		String color = entrada.nextLine();		
		miCoche.setColor(color);
		System.out.println(miCoche.getColor());
		System.out.println(miCoche);
		miCoche.setCuero("si");
		System.out.println(miCoche.getCuero());
		System.out.println(miCoche.getPesoTotal());
		
		Coche c = new Furgoneta(5,6);
		Furgoneta f = (Furgoneta) c;
		System.out.println("La furgoneta tiene " + ((Furgoneta)c).getplazasExtra()
				+ "de plazas extra");
		
		System.out.println(miCoche);
		System.out.println(f);
		

	}

}
