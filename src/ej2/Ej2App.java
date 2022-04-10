package ej2;

public class Ej2App {

	public static void main(String[] args) {
		
		int n = 5;
		double a = 10.5;
		char c = 'V';
		
		int codigoAscii = (int)c; //hacemos conversión entre diferentes tipos
		
		System.out.println("Valor de n: " + n);
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de c: " + c);
		System.out.println("");
		
		System.out.println("La suma de " + n + " y " + a + " es " + (n+a));
		System.out.println("La diferencia de " + a + " y " + n + " es " + (a-n));
		System.out.println("El valor numérico del carácter " + c + " es " + codigoAscii);

	}

}
