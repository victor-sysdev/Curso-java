package Operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
//	trabalho na terça (V ou F)
//	tabralho na quita (V ou F)

	boolean trabalho1 = !true;
	boolean trabalho2 = !!true; 
	
	
	boolean ComprouTV50 = trabalho1 && trabalho2;
	boolean ComprouTV32 = trabalho1 ^ trabalho2;
	boolean ComprouSorvete = trabalho1 || trabalho2;
	
	System.out.println(ComprouTV50);
	System.out.println(ComprouTV32);
	System.out.println(ComprouSorvete);
	System.out.println(!ComprouSorvete);
	
	
	
	}

	
	
	
}




