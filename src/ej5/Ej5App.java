package ej5;

public class Ej5App {

	public static void main(String[] args) {
	
		int a = 5;
		int b = 10;
		int c = 15;
		int d = 20;
		
		System.out.println("Valores iniciales: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("");
		
		b = c;
		c = a;
		a = d;
		d = b; 
		
		System.out.println("Valores actualizados: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
	}

}
