package Operadores;

public class DisafioAritmeticos {
	
	public static void main(String[] args) {
		
//		Primeira parte do codigo 
		int Subitacao = 2 - 7;
		int Subitracao2 = 1 - 5 ;
		int Parenteses = (int) Math.pow((Subitacao * Subitracao2 / 2),2) ;
		int DezElevado = (int) Math.pow(10,3);
		
			System.out.println(Parenteses);
		
//		Segunda Parte 
		int Chaves = 3 + 2; 
		int Vezes = 3 * 2; 
		int Seis = 6; 
		int Colchetes = (int) Math.pow((Chaves * Seis),2);
		int Divisão = Colchetes/Vezes ;
		
			System.out.println(Divisão);
		
//		Teceira parte 
		int SubitracaoDosFatores = Divisão - Parenteses;
		
			System.out.println(SubitracaoDosFatores);
		
//		Parte final 
		int Elevado = (int) Math.pow(SubitracaoDosFatores,3);
		
			System.out.println(Elevado/DezElevado);
				
	}
	
	
}
