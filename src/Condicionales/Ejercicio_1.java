package Condicionales;

import java.util.Scanner;

public class Ejercicio_1 {
	
	public static void main(String[]args ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nota");
		int nota = scan.nextInt();
		
		if (nota==8 && nota<11) {
			System.out.println("Sobresaliente");
		}
		if (nota==0 && nota<6) {
			System.out.println("Suspenso");
		}
		if (nota==5 && nota<7) {
			System.out.println("Aprobado");
		}
		if (nota==7 && nota <9) {
			System.out.println("Notable");
		}
	}
	}
	

