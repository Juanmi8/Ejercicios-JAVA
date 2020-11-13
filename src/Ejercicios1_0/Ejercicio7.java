package Ejercicios1_0;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas 
		 * hay en el curso actual. Diseñar un algoritmo para este propósito 
		 * (recuerda que para calcular el porcentaje puedes hacer una regla de 3).
		 */
		
		float niños, niñas, total;
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Dime dos numeros");
		
		niños = leer.nextInt();
		niñas = leer.nextInt();
		
		total = niños + niñas;
		
		System.out.println("El porcentaje de niños es de " + ((niños/total)*100) + "%\nEl porcentaje de niñas es de " + ((niñas/total)*100)+ "%");

	}

}
