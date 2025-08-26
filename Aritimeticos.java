package Operadores;

public class Aritimeticos {
	
	public static void main(String[] args) {
//		Operadores Unarios 
		System.out.println(2 + 3);
		
		var x = 33.22;
		double y = 22.22;
//		Basicos
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8; 
		int b = 3;
		
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
//		Convertendo valores
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
//		Modulado resro de uma divisão 
		System.out.println(a % 3);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b );
	}

}
