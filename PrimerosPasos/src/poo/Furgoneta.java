package poo;


public class Furgoneta extends Coche {
	
	/**
	 * Capacidad extra
	 */
	private int capacidadExtra;
	
	/**
	 * 
	 */
	private int plazasExtra;
	
	/**
	 * Constructor
	 * @param capacidadExtra capacidad extra
	 * @param plazasExtra plazas extra
	 */
	public Furgoneta(int capacidadExtra, int plazasExtra) {
		super();
		this.capacidadExtra = capacidadExtra;
		this.plazasExtra = plazasExtra;
		
	}
	
	public int getCapacidadExtra() {
		return capacidadExtra;
	}
	
	public int getplazasExtra() {
		return plazasExtra;
	}

	@Override
	public String toString() {
		return  super.toString() + " [capacidadExtra=" + capacidadExtra + ", plazasExtra=" + plazasExtra + "]";
	}
	
	
	
	
	
	
	

}
