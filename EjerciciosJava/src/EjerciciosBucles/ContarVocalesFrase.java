package EjerciciosBucles;

public class ContarVocalesFrase {
		  
	    public static void main(String[] args) {
	  
	        String cadena="El Betis va a Ganar la UEFA";
	  
	        int contador=0;
	        for (int i=0;i<cadena.length();i++){
	            //Comprobamos si el caracter es una vocal
	            if(cadena.charAt(i)=='a' || 
	                    cadena.charAt(i)=='e' || 
	                    cadena.charAt(i)=='i' || 
	                    cadena.charAt(i)=='o' || 
	                    cadena.charAt(i)=='u'){
	                contador++;
	            }
	        }
	  
	        System.out.println("Hay "+contador+" vocales");
	    }
	}