package Operadores;

public class Ternario {
   
	public static void main(String[] args) {
	
		double media = 7.6;
		String resultadorParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadorParcial;
		
		System.out.println("O aluno esta " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;  
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem desconto " + temDesconto );
		;
  }
}
