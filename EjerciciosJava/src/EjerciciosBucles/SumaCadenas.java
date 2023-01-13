package EjerciciosBucles;

import javax.swing.JOptionPane;

public class SumaCadenas {

	 public static void main(String[] args) {
	        
	        String texto=JOptionPane.showInputDialog(null, 
	                                                 "Introduce un texto, cadena vacia para terminar", 
	                                                 "Introducir texto", 
	                                                 JOptionPane.INFORMATION_MESSAGE);
	        
	        String cadenaResultante="";
	         
	        //Mientras se introduzca una cadena no vacía
	        while(!texto.isEmpty()){
	             
	            //Concatenamos el texto
	            cadenaResultante+=texto;
	             
	            //Reintroducimos de nuevo una cadena
	            texto=JOptionPane.showInputDialog(null, 
	                                            "Introduce un texto, cadena vacia para terminar", 
	                                            "Introducir texto", 
	                                            JOptionPane.INFORMATION_MESSAGE);
	 
	        }
	         
	        JOptionPane.showMessageDialog(null, 
	                                        cadenaResultante, 
	                                        "Resultado", 
	                                        JOptionPane.INFORMATION_MESSAGE);
	         
	    }
	     
	}
