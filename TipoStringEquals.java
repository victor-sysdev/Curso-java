package Operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals (s));// equals serve para comparar Strings

		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();//diferença entre next e nextLine e que o line tira os espaços em braco 
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));//.trim serve para tirar os espasos em branco de uma digitação 
		entrada.close();
		  
		//para comparar String e .equals == não pode 
	}
}
