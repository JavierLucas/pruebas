import javax.swing.JOptionPane;


public class BucleComprobadorCorreo {

	public static void main(String[] args) {
		boolean correcto = false;
		boolean punto = false;
		String correo = JOptionPane.showInputDialog("Introduce la dirección de correo: ");
		
		for(int i = 0; ( i < correo.length()); i++){
			if(correo.charAt(i) == '@'){
				//comprobamos que solo haya un arroba. Se podía haber hecho contando
				//el número de arrobas que hay. Si hay 1 es correcto
				if (correcto){
					correcto = false;
					break;
				}
				else{
					correcto = true;
				}
			}
			else if(correo.charAt(i) == '.'){
				punto = true;
			}
		}
		
		if(correcto && punto){
			System.out.println("La dirección de correo " + correo + " es correcta");
		}
		else{
			System.out.println("La dirección de correo " + correo + " NO es correcta");
		}
		

	}

}
