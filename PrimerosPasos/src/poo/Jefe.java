package poo;

public class Jefe extends Empleado implements Jefes{
	
	private double sueldoExtra;
	
	//Constructor con todos los parámetros
	public Jefe(String nombre, double sueldo, int anyo, int mes, int dia, double sueldoExtra) {
		super(nombre, sueldo, anyo, mes, dia);
		this.sueldoExtra = sueldoExtra;		
	}
	
	//Constructor reducido
	public Jefe(String nombre, double sueldoExtra){
		this(nombre, 10000, 2000,1,1,sueldoExtra);
		
	}
	public double getSueldoExtra() {
		return sueldoExtra;
	}
	
	public void setSueldoExtra(double sueldo) {
		sueldoExtra = sueldo;		
	}
	
	public double getSueldo() {
		return super.getSueldo() + getSueldoExtra();
	}
	
	@Override
	public String descripcion() {
		return "Soy un jefe y mi sueldo extra es de " + sueldoExtra ;
	}

	@Override
	public String tomaDecisiones(String s) {
		return "Se ha tomado la decisión de " + s;
	}
	
	@Override
	public double setBonus(double bonus) {
		
		double incentivo = 2000;
		return super.setBonus(bonus) + incentivo;
		
	}

}
