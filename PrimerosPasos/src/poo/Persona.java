package poo;

public abstract class Persona {
	String nombre;
	protected int dni;
	
	private static int nextDni = 0;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		dni = nextDni;
		nextDni++;
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public abstract String descripcion();
	
	/**
	 * setter
	 * @param nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	

}
