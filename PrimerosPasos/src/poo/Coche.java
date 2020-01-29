package poo;
//Los import van detrás del package

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	boolean asientosCuero;
	boolean climatizador;
	
	
	//Método constructor
	public Coche(){
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}
	
	//método getter
	
	public String getLargo(){
		//variable privada dentro de una clase solo es accesible desde la propia clase
		return "El largo del coche es " + largo;
	}
	
	public String getColor(){
		return "El color del coche es " + color;
	}
	
	public String toString(){
		return "La plataforma del"  + this.getClass().toString() + " tiene " + ruedas + " ruedas" +
	". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " +
				pesoPlataforma;
	}
	
	//Método setter
	
	public void setColor(String colorCoche){
		color = colorCoche;
		
	}
	public void setCuero(String asientosCuero){
		if(asientosCuero.equalsIgnoreCase("si")){
			this.asientosCuero = true;
		}
		else{
			this.asientosCuero = false;
		}
		
	}
	public String getCuero(){
		if(asientosCuero){
			return "El coche tiene asientos de cuero";
		}
		else{
			return "El coche NO tiene asientos de cuero";
		}
	}
	
	public void setClimatizador(String climatizador){
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador = true;
		}
		else{
			this.climatizador = false;
		}
	}
	
	public String getClimatizador(){
		if(climatizador){
			return "El coche tiene climatizador";
		}
		else{
			return "El coche lleva aire acondicionado";
		}
	}
	public String getPesoTotal(){
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if(asientosCuero){
			pesoTotal += 50;
		}
		if(climatizador){
			pesoTotal += 20;			
		}
		return "El peso total del coche es " + pesoTotal;
		
	}

}
