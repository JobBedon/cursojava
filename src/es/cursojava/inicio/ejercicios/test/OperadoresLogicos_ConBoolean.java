package es.cursojava.inicio.ejercicios.test;

import java.util.Scanner;

public class OperadoresLogicos_ConBoolean {

public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Introduce un numero");
	int num1 = scan.nextInt();

	
	System.out.println("Introduce otro numero");
	int num2 = scan.nextInt();
	
	boolean comparador = num1>num2;
	
	System.out.println(num1 +" es mayor que "+ num2 +": "+comparador);
	System.out.println(num1 +" es igual a "+ num2 +": "+(num1==num2));
	System.out.println(num1 +" es menor que "+num2 +" : "+(num1<num2));

	
	scan.close();
}
}