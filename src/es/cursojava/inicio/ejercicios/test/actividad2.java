package es.cursojava.inicio.ejercicios.test;

public class actividad2 {
	public static void main(String[] args) {
		int num = 5;
		
		System.out.println(num/2);
		System.out.println(num%2);
		
		//Operador ++ suma 1 a la variable sobre la que se aplcia
		System.out.println(num++);//6
		//System.out.println(num);
		System.out.println(num);
		System.out.println(++num);//7
		
		int num2 = 5 + num;
		//num = num + num2; la igualdad asigna nuevos valores
		System.out.println(num+=num2);
		
	}

}
