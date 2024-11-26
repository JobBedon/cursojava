package Ejercicios;

import java.util.Scanner;

public class Ejercicios_12 {

	public static void main(String[] args) {{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int num1 = scan.nextInt();
		System.out.println("Introduce tus años en la empresa");
		int num2 = scan.nextInt();
		System.out.println("Introduce tu sector");
		int num3 = scan.nextInt();
		
				
		if (num1<=18) {
			System.out.println("Becario");
		}
		else if (num1>18 && num1<35) {
			System.out.println("Becario medio");
		}
		else if (num2>35) {
			System.out.println("Veterano");
		}
			
		}
		
	}
	
	
}
