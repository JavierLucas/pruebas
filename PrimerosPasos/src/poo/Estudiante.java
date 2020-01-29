package poo;

public class Estudiante extends Persona {

	/**
	 * Carrera que está cursando el estudiante
	 */
	private String carrera;
	
	/**
	 * Constructor 
	 * @param nombre del estudiante
	 * @param carrera que está cursando
	 */
	public Estudiante(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}

	@Override
	public String descripcion() {
		return "Soy un estudiante y estoy estudiando " + carrera;
	}

}
