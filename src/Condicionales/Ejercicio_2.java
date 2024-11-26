package Condicionales;

import java.util.Scanner;

public class Ejercicio_2 {
	
	public static void main(String[]args ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = scan.nextInt(); 
		
		System.out.println("Introduce un numero");
		int num2 = scan.nextInt();
		
		System.out.println("Escribe la operación SUMA o RESTA");
		scan = new Scanner(System.in);
		String operacion = scan.nextLine(); 
		
		if (operacion.equals("SUMA")) {
			System.out.println(num1+num2);
		}
		else if (operacion.equals("RESTA")) {
			System.out.println(num1-num2);
			
		}
		
		
		
	
		
		
	
		
	
	}
}
