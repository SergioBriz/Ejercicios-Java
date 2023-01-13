package EjerciciosBucles;

import java.util.Scanner;

public class PideNumeros {

	    public static void main(String[] args) {
	         
	        //Variables necesarias
	        int numeroUsuario=0;
	        int menor=0;
	        int mayor=0;
	        int suma=0;
	        double media;
	        int contador=-1;
	        int sumaPositivos=0;
	        int sumaNegativos=0;
	         
	        //Creamos el Scanner
	        Scanner sn = new Scanner(System.in);
	         
	        do{
	             
	            //Comprobamos si el número es menor
	            //que el actual menor
	            if(menor>numeroUsuario){
	                menor = numeroUsuario;
	            }
	             
	            //Comprobamos si el numero es mayor
	            //que el actual mayor
	            if(mayor<numeroUsuario){
	                mayor=numeroUsuario;
	            }
	             
	            //Suma el número y lo acumulamos
	            suma+=numeroUsuario;
	             
	            //Si el número es positivo, suma a la variable de los positivos
	            // y sino a la de los negativos
	            if(numeroUsuario>=0){
	                sumaPositivos+=numeroUsuario;
	            }else{
	                sumaNegativos+=numeroUsuario;
	            }
	             
	            //Aumento el contador
	            contador++;
	             
	            //pido un numero al usuario 
	            System.out.println("Introduce un numero");
	            numeroUsuario = sn.nextInt();
	             
	            //Cuando el usuario ponga un -1, saldremos
	           
	        }while(numeroUsuario!=-1);
	         
	        //Calculamos la media
	        media = (double) suma / contador;
	         
	        //Mostramos los valores
	        System.out.println("El menor es: "+menor);
	        System.out.println("El mayor es: "+mayor);
	        System.out.println("La suma es: "+suma);
	        System.out.println("La suma de los positivos es: "+sumaPositivos);
	        System.out.println("La suma de los negativos es: "+sumaNegativos);
	        System.out.println("La media es: "+media);
	         
	    }
	     
	
}