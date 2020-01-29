package poo;

import java.util.ArrayList;
import java.util.List;

public class UsoPersona2 {
	static public void main(String args[]) {
		List <Persona> personas = new ArrayList<>();
		
		Empleado e = new Empleado("Javier", 100000, 2000, 10, 10);
		Jefe j = new Jefe("Paula", 10000);
		Estudiante es = new Estudiante("Miguel", "Periodismo");
		
		personas.add(e);
		personas.add(j);
		personas.add(es);
		
		System.out.println(j.tomaDecisiones("despedir a todo el mundo"));
		
		for(Persona p:personas) {
			if (p instanceof Empleados) {
				System.out.println(((Empleados)p).setBonus(500));
			}			
		}
		
		for(Persona p:personas) {
			System.out.print(p);
			System.out.println(p.descripcion());
			
		}
	}
}
