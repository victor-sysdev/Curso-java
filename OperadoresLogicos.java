package Operadores;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true; 
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		
//		Tabela verdade 
		
		System.out.println("Tabela verdade E (END)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("Tabela verdade OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false|| true);
		System.out.println(false|| false);
		
		System.out.println("Tabela verdade OU escluxivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^false);
		System.out.println(false^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela verdade NÃO escluxivo (NOT)");
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println(!!false);
		
		
		
		
		
		
		

		
		
		
		
	}

}
