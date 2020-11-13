package Ejercicios1_0;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Algoritmo que lea tres números distintos y nos diga cual de 
		 * ellos es el mayor (recuerda usar la estructura condicional Si 
		 * y los operadores lógicos).
		 */
		
		int num1, num2, num3;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime el num1, el num2 y el num3");
		
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();
		
		if (num1>=num2) {
			
			System.out.println("El mayor es");
			
		}
	}

}
