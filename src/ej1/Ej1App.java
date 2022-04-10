package ej1;

public class Ej1App {

	public static void main(String[] args) {
		
		int a = 22;
		int b = 7;
		int suma = a + b;
		int resta = a - b;
		int multiplicacion = a * b;
		double division = (float)a / b; //hacemos casting para visualizar los decimales
		int modulo = a % b;
		
		System.out.println("La suma de " + a + " y " + b + " es " + suma);
		
		System.out.println("La resta de " + a + " y " + b + " es " + resta);
		
		System.out.println("La multiplicación de " + a + " y " + b + " es " + multiplicacion);
		
		System.out.println("La división entre " + a + " y " + b + " es " +
		String.format("%.2f", division)); //establecemos el formato para mostrar solo dos decimales
		
		System.out.println("El modulo de " + a + " y " + b + " es " + modulo);
		
	}

}
