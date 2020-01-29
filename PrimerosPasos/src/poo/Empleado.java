package poo;

import java.util.Date;
import java.util.GregorianCalendar;

class Empleado extends Persona implements Comparable<Empleado>, Empleados{
	/**
	 * Constructor
	 * @param nombre nombre del empleado
	 * @param sueldo sueldo del empleado
	 * @param anyo año
	 * @param mes mes
	 * @param dia dia
	 */
	public Empleado(String nombre, double sueldo, int anyo, int mes, int dia) {
		super(nombre);
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anyo, mes-1, dia);
		fecha = calendario.getTime();
		id = Empleado.idSiguiente;
		Empleado.idSiguiente++;
		
	}	
	

	
	
	/**
	 * Getter
	 * @return sueldo del empleado
	 */
	public double getSueldo() {
		return sueldo;
	}
	
	/**
	 * Setter
	 * @param sueldo que queremos establecer al empleado
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	/**
	 * Getter
	 * @return fecha de alta del empleado
	 */
	public Date getFecha() {
		return fecha;
	}
	
	/**
	 * Setter
	 * @param fecha de alta del empleado
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void aumentarSueldo(double aumento) {
		aumento = sueldo*aumento/100;
		sueldo += aumento;
	}

	
	/**
	 * Sueldo del empleado
	 */
	private double sueldo;
	
	/**
	 * Fecha de alta del empleado
	 */
	private Date fecha;
	
	/**
	 * Id del empleado
	 */
	private int id;
	
	/**
	 * Id que se asignará al siguiente empleado
	 */
	private static int idSiguiente = 1;
	
	/**
	 * Getter
	 * @return siguiente id
	 */
	public static String getNextID() {
		return "El id siguiente es " + idSiguiente;
	}


	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + this.getSueldo() + ", dni=" + dni + " puesto " + this.getClass().getCanonicalName() + "]";
	}

	public int compareTo(Empleado e) {
		if(this.getSueldo() < e.getSueldo()) {
			return -1;
		}
		else if(this.getSueldo() > (e).getSueldo()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

	@Override
	public String descripcion() {
		return "Empleado de la empresa";
	}




	@Override
	public double setBonus(double bonus) {
		return Empleados.base + bonus;
		
	}

	


	
	
}

