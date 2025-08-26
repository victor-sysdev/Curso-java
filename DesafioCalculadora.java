package Operadores;

import java.util.Scanner;

public class DesafioCalculadora {
		
	public static void main(String[] args) {
	
		 
	System.out.println("Digite um numero");
		
			Scanner entrada = new Scanner(System.in);
		
				String valor = entrada.next();
		
	System.out.println("Digite outro numero");
		
			Scanner entrada1 = new Scanner(System.in);
			
				String valor2 = entrada1.next();
			
		double numero1 = Double.parseDouble(valor);
		double numero2 = Double.parseDouble(valor2);
		
		System.out.println("Escolha a operação");
		String op = entrada1.next();
		
		// logica
		
		double resultado = "+".equals(op) ? numero1 + numero2 : 0;
		resultado = "-".equals(op) ? numero1 - numero2 : resultado;
		resultado = "*".equals(op) ? numero1 * numero2 : resultado;
		resultado = "/".equals(op) ? numero1 / numero2 : resultado;
		resultado = "%".equals(op) ? numero1 % numero2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f ", numero1, op , numero2, resultado);
		entrada1.close();
		
		
		
		
		
		

	
	
	}
	
}
