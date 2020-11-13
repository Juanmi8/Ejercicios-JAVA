package Ejercicios1_0;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Algoritmo que lea dos números, calculando y escribiendo
		 *   el valor de su suma, resta, producto y división.
		 */
		
		float num1, num2;
		
		Scanner leer = new Scanner(System.in);
		
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		System.out.println("Introduce el numero 1");
		num1= leer.nextInt();
		
		System.out.println("Introduce el numero 2");
		num2= leer.nextInt();
		
		System.out.println("La suma de num1 y num2 es de " + (num1 + num2));
		System.out.println("La resta de num1 y num2 es de " + (num1 - num2));
		System.out.println("El producto de num1 y num2 es de " + (num1 * num2));
		System.out.println("La division de num1 y num2 es de " + (num1 / num2));
		
	}

}
