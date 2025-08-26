package TiposPrimitivos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digete o primeiro numero ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero");// JOptionPane.showInputDialog mesagem na tela 
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);//contatenação porque e uma em string 
		double numero2 = Double.parseDouble(valor2);//contatenação porque e uma em string 
		
		double soma = numero1 + numero2; 
		
		System.out.println("Soma e " + soma);
		System.out.println("Media e " + soma/2);
		
		double Media = numero1 + numero2 /2;
		
		JOptionPane.showInputDialog( Media );
		
		
	}

}
