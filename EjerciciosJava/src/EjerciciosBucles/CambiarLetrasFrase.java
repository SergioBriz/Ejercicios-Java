package EjerciciosBucles;

public class CambiarLetrasFrase {

		 
	    public static void main(String[] args) {
	 
	        String cadena="Viva el Betis manquepierda";
	 
	        /*De esta forma no modifica el String original
	         *Y en el texto de la pantalla se sustituir�n la 'a' por la 'e'
	          */
	        
	        System.out.print(cadena.replace('a', 'e'));
	       	 
	    }
	}