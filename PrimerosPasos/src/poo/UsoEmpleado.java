package poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class UsoEmpleado {
	public static void main(String args[]) {
		List <Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado e1 = new Empleado("Jose Martínez", 15000, 2009, 04, 03);
		Empleado e3 = new Empleado("Miguel Lucas", 20000, 2001, 10, 29);
		Empleado e2 = new Empleado("María López", 10000, 1994, 03, 13);		

		Jefe jefe = new Jefe("Prueba 1", 40000, 2000, 4, 30, 10000);
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(jefe);
		empleados.add(e3);
	
		
		//Aumentamos a todos el sueldo
		for(int i = 0; i < empleados.size(); i++) {
			empleados.get(i).aumentarSueldo(10);			
		}
		
		gestionOpciones(empleados);
		for(Empleado e:empleados) {
			System.out.println(e);
		}
		
	}
	
	private static void gestionOpciones(List <Empleado> l) {
		String message = "¿Quiere ordenar la lista?";
		int opcion = JOptionPane.showConfirmDialog(null, message, "Opciones", JOptionPane.INFORMATION_MESSAGE);
		
		if(opcion == 0) {
			String [] options = {"Salario", "ID"};
			opcion = JOptionPane.showInternalOptionDialog(null, "Elija opción para ordenar", 
					"Ordenación", 2, JOptionPane.QUESTION_MESSAGE, null, options, null);
			if(opcion == 0) {
				JOptionPane.showMessageDialog(null, "Ordenando por salario", "Información", JOptionPane.INFORMATION_MESSAGE);
				Collections.sort(l, new Comparator<Empleado>() {
					@Override
					public int compare(Empleado o1, Empleado o2) {
						return (int) (o1.getSueldo() - o2.getSueldo());
					}
					
				});
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Ordenando por id", "Información", JOptionPane.INFORMATION_MESSAGE);
				Collections.sort(l, new Comparator<Empleado>() {

					@Override
					public int compare(Empleado o1, Empleado o2) {
						
						return (int) (o1.dni - o2.dni);
					}
					
				});
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Has elegido no ordenar", "Información", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
