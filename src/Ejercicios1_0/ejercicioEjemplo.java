package Ejercicios1_0;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ejercicioEjemplo {

	public static int pintaMenu() {
		
		int opc=0;
		
		Scanner leer = new Scanner(System.in);
		
		while (opc<1 ||opc>3) {
			
			System.out.println("1- Hola");
			System.out.println("2- Si");
			System.out.println("3- Salir");
			System.out.println("-------");
			System.out.println("Dime una opcion");
			
			opc = leer.nextInt();
		
			}
	
		
		return opc;
		
		}
	
	public static void main (String[] args) {
		
		
		int opc=0;
		
		do {
			opc = pintaMenu();
			switch (opc) {
			
			case 1:
				System.out.println ("Hola");
				break;
				
			case 2:
				System.out.println ("Si");
				break;
				
			case 3:
				System.out.println ("Gracias por la visita");
				break;
			}
		} while (opc!=3);
		
		
	}
	
}
