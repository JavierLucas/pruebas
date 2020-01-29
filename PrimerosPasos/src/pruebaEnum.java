import javax.swing.JOptionPane;

public class pruebaEnum {
	
	enum Talla{
		MINI("XS"),
		PEQUENYA("S"),
		MEDIANA("M"),
		GRANDE("L");
		
		
		
		private String abreviatura;
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
	}
	
	public static void main(String args[]) {
		
		String entrada = JOptionPane.showInputDialog("Introduzca la talla deseada").toUpperCase();
		try {
			Talla t = Enum.valueOf(Talla.class, entrada);
			int opcion = JOptionPane.showConfirmDialog(null, "Quiere ver el resultado?");
			if(opcion == 0) {
				String resultado = "La talla elegida ha sido " + t + ", cuya abreviatura"
						+ " es " + t.getAbreviatura();
				System.out.println(resultado);	
				
				JOptionPane.showInternalMessageDialog(null, resultado, "RESULTADOS", 
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			else {
				System.out.println("No ha querido ver la opción");
			}
		}
		catch(IllegalArgumentException e) {
			System.err.println("No ha elegido una opción válida");
			JOptionPane.showMessageDialog(null, "No ha elegido una opción válida", 
					"ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		

	}

}
