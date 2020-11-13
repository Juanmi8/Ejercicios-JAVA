package Ejercicios1_0;

public class dudas {
	
	public static void sumaParImpar(int a, int b) {
	
		int sumPar = 0, sumImpar = 0;
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 ==0) {
				sumPar = sumPar + i;
			} else {
				sumImpar += i;
			}
		}
		System.out.println("Pares: " + sumPar);
		System.out.println("Impares: " + sumImpar);
	}	
	
	public static void main(String[] args) {
		int num1=5, num2=10;

		sumaParImpar(num1, num2);
	}
		
		
		
		
		
		

	}


