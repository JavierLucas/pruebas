package poo;

public class Estudiante extends Persona {

	/**
	 * Carrera que est� cursando el estudiante
	 */
	private String carrera;
	
	/**
	 * Constructor 
	 * @param nombre del estudiante
	 * @param carrera que est� cursando
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
