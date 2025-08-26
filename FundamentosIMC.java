package Operadores;

import java.util.Scanner;

public class FundamentosIMC {
	
	public static void main(String[] args) {
		
		
		String  Altura ;
		String  Peso;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual e a sua altura?");
		
		Altura = entrada.nextLine().replace(",", ".");
	
		System.out.println("Qual e o seu peso?");

		Peso = entrada.nextLine().replace(",", ".");
		
		double converteAltura = Double.parseDouble(Altura);
		double convertePeso = Double.parseDouble(Peso);
		
		double IMC = convertePeso /(converteAltura * converteAltura );
		
		System.out.println("O seu IMC:" + IMC);
	}

}
