package es.cursojava.inicio.ejercicios.test;
import java.util.Scanner;

public class OperadoresLogicos4 {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero para verificar si es par");
		double num1 = scan.nextDouble();
		boolean comparador = num1%2 == 0;
		System.out.println(comparador);
		
	}
}
