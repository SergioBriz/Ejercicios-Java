package EjerciciosBucles;

import java.util.Scanner;

public class AciertaPassword {

	  
	    public static void main(String[] args) {
	  
	        Scanner sc = new Scanner(System.in);
	        String contrase�a="vivaelbetis";
	  
	        final int INTENTOS = 3;
	         
	        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
	        boolean acierto=false;
	  
	        String password;
	        for (int i=0;i<INTENTOS && !acierto;i++){
	            System.out.println("Introduce una contrase�a");
	            password = sc.next();
	  
	            //Comprobamos si coincide, usamos el metodo equals
	            if (password.equals(contrase�a)){
	                System.out.println("Enhorabuena, acertaste");
	                acierto=true;
	            }
	        }
	    }
	}