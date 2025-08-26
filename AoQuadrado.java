package Operadores;

import java.util.Scanner; 

public class AoQuadrado {
	public static void main(String[] args) {
		
		
		String valor;
		
		System.out.println("Digite um valor que voce deseja elevar ao quadrado e cubo");
		
		Scanner entrada = new Scanner(System.in);
		
		valor = entrada.nextLine();
		
		double valorAoQuadrado = Double.parseDouble(valor);
		
		double DefinitivoQuadrado = valorAoQuadrado * valorAoQuadrado;
				
		System.out.println("O resultado e " + DefinitivoQuadrado);
		
		double DefinitivoCubo = valorAoQuadrado * valorAoQuadrado * valorAoQuadrado;
		
		System.out.println("O resultado e " + DefinitivoCubo);
		
		
	}

}
