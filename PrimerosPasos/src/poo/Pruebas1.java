package poo;

public class Pruebas1 {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		Coche c2 = c1;
		c2.setClimatizador("si");
		c1.setCuero("si");
		System.out.println(c1.getPesoTotal());
		
	}

}
