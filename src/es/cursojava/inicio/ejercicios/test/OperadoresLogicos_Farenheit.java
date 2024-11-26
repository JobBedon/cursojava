package es.cursojava.inicio.ejercicios.test;

import java.util.Scanner;

public class OperadoresLogicos_Farenheit {

	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce temperatura en grados Celsius");
		double tempCelsius = scan.nextDouble();
		System.out.println(9/5);
		double tempFarenheit = tempCelsius*(9/5)+32;
		System.out.println(tempFarenheit);
		
		int operacion = 7+3*2/2+4;
		System.out.println(operacion);
	}
	
	
}
