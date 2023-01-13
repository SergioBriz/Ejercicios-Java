package HolaMundo;

import javax.swing.JOptionPane;

public class HolaMundoJOptionPane {

	  public static void main(String[] args) {
		  
          //Nos aparece un cuadro de dialogo
  String nombre=JOptionPane.showInputDialog("Introduce tu nombre");

  System.out.println("Bienvenido "+nombre);
}
}