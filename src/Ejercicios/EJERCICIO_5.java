package Ejercicios;

import java.util.Scanner;

public class EJERCICIO_5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce temperatura en grados Celsius");
		double tempCelsius = scan.nextDouble();
		System.out.println(9/5);
		double tempFarenheit = tempCelsius*9.0/5.0+32;
		System.out.println(tempFarenheit);
		
		int num2 = 6;
		System.out.println(num2);
		int operacion = (8+3)*4/2+(num2++);
		
		System.out.println(num2);
		System.out.println(operacion);
		
		
		
				
		
	}
	
	
	

}
