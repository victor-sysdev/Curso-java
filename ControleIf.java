package EstruturaControle;

import java.util.Scanner;

public class ControleIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			
			System.out.println("Aluno aprovado!");
			
		}else{
			
			System.out.println("Aluno de recuperação!");
			
		}
		
		entrada.close();
	}

}
