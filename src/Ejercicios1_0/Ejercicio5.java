package Ejercicios1_0;

import java.util.Scanner;


public class Ejercicio5 {

	public static void main(String[] args) {
		/*Diseñar un algoritmo que pida por teclado tres números; si el primero es 
		 * negativo, debe imprimirel producto de los tres y si no lo es, 
		 * imprimirá la suma.
		 */

		int num1, num2, num3;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime 3 numeros");
		
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();
		
		if (num1<0) {
			
			System.out.println("El producto es de " + num1*num2*num3);
		
		} else {
			
			if (num1>=0) {
				
			System.out.println("La suma es de " + (num1+num2+num3));
			}
		}
		
		
	}

}
