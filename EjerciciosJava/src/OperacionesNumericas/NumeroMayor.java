package OperacionesNumericas;

public class NumeroMayor {

	public static void main(String[] args) {
		 
        //Declaramos las variables
        int num1=30;
        int num2=15;
 
        //Hacemos la comprobaci�n
        if (num1>=num2){
           
            if(num1==num2){
                System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
            }else{
                System.out.println("El n�mero "+num1+" es mayor que el n�mero "+num2);
            }
        }else{
            System.out.println("El n�mero "+num2+" es mayor que el n�mero "+num1);
        }
    }
}