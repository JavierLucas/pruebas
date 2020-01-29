package poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class usoPersona {

	public static void main(String[] args) {
		List <Empleado> empleados = new ArrayList<Empleado>();
		Empleado e1 = new Empleado("Jose Martínez", 15000, 2009, 04, 03);
		Empleado e2 = new Empleado("María López", 10000, 1994, 03, 13);
		Empleado e3 = new Empleado("Miguel Lucas", 20000, 2001, 10, 29);
		Jefe jefe = new Jefe("Prueba 1", 40000, 2000, 4, 30, 10000);
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(jefe);
		
		//Aumentamos a todos el sueldo
		for(int i = 0; i < empleados.size(); i++) {
			empleados.get(i).aumentarSueldo(10);			
		}
		
		//Mostramos el resultado por pantalla sin ordenar
		System.out.println("Resultados NO ordenados");
		for(Empleado e:empleados) {
			System.out.println(e);
		}
		
		Collections.sort(empleados);
		
		System.out.println("Resultados ordenados");
		//Mostramos el resultado por pantalla ordenado
		for(Empleado e:empleados) {
			System.out.println(e);
		}
		
		System.out.println(Empleado.getNextID());
		
		
		//Ahora probamos la clase jefe
		
		//Jefe que recibe todos los parámetros
		Jefe j = new Jefe("Pepe", 1000,2010,2,2,400);
		Jefe j1 = new Jefe("María", 500);
		Empleado e5 = new Empleado("Jose", 1000,2010,2,2);
		
		System.out.println(j.getSueldo());
		System.out.println(e5.getSueldo());
		System.out.println(j1.getSueldo());
		
		Empleado e;
		e = j;
		System.out.println(e.getSueldo());
		

	}

}

 