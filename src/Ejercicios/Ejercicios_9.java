package Ejercicios;

public class Ejercicios_9 {
	
	public static void main(String[] args) {
		int minutosLlamada = 6;
		double precioLlamada = 12;
		
		if (minutosLlamada>0 && minutosLlamada<=6) {
			precioLlamada+=1;
			//precioLlamada++;
			//precioLlamada = preioLlamada + 1;
		
		}
		if (minutosLlamada>5) {
			precioLlamada+=0.8;
			
		}
		if (minutosLlamada>8) {
			precioLlamada+=0.7;
		
		}
		if (minutosLlamada>10) {
			precioLlamada += (minutosLlamada-10*0.5);
			
		}
		System.out.println("El precio de la llamada total es "+ precioLlamada);
	
		
	}

}
