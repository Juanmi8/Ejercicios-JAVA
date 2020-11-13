package Ejercicios1_0;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Una tienda ofrece un descuento del 15% sobre el total de la compra durante el 
		 * mes de octubre. Dado un mes y un importe, calcular cuál es la cantidad que 
		 * se debe cobrar al cliente.
		 */
		
		
		int num1;
		String mes;
		
		Scanner leer = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		num1 = leer.nextInt();
		System.out.println("Dime un mes");
		mes = leer2.nextLine();
		
		if (mes.equalsIgnoreCase("octubre")) {
			
			System.out.println("La cantidad que hay que cobrar es de " + (num1 -(num1*0.15)));
			
		}
		
	}

}
