package Ejercicios1_0;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Realizar un algoritmo que lea un número por teclado. En caso de que ese número
		 *  sea 0 o menor que 0, se saldrá del programa imprimiendo antes un mensaje de 
		 *  error. Si es mayor que 0, se deberá calcular su cuadrado y la raiz cuadrada 
		 *  del mismo, visualizando el numero que ha tecleado el usuario y su resultado 
		 *  (“Del numero X, su potencia es X y su raiz X” ). Para calcular la raiz 
		 *  cuadrada se puede usar la función interna RAIZ(X) o con una potencia de 0,5
		 */
		
		int num1;
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Dime un numero");
		num1 = leer.nextInt();
		
		if (num1<=0) {
			
			System.out.println("ERROR");
			
		} else {
			
			if (num1>0) {
				
				System.out.println("El cuadrado es " + (num1*num1) + "\nLa raiz es " + (Math.pow(num1,0.5)));
			}
		}

	}

}
