package es.cursojava.inicio.ejercicios.test;

import java.util.Scanner;

public class OperadoresLogicos_Ejercicio3 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = scan.nextInt();
		
		boolean esPar = num1%2==0;
		System.out.println("El numero "+num1 + " es par "+ esPar);
		System.out.println("El numero "+num1 + " es impar "+ !esPar);
		
	}



}
