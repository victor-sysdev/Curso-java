package Operadores;

import java.util.Scanner;

public class BaseTriangulo {
	
	public static void main(String[] args) {
		
		String base;
		String Altura;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da Base");
			base = entrada.next();
			
		System.out.println("Digite o valor da Altura");
			Altura = entrada.next();
		
		double converteBase = Double.parseDouble(base);
		double converteAltura = Double.parseDouble(Altura);
		
		double resultado = (converteBase*converteAltura)/2;
		
		System.out.println("A Base e " + resultado );	
		
	}

}
