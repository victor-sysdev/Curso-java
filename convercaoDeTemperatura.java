package Operadores;

import java.util.Scanner;

public class convercaoDeTemperatura {
	
	public static void main(String[] args) {
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		
		String temperatura;
		
		Scanner entrada = new Scanner(System.in);
		
		temperatura = entrada.nextLine();
		
		double Fahr = Double.parseDouble(temperatura);
		
		
		double Celsius = (Fahr - 32)  * 5/9;
		
		System.out.println("Temperatura em celsius " + Celsius);
		
		String Aocontrario; 
		double c;
		
		System.out.println("digite a temperatura em Celsius");
		
		Aocontrario = entrada.next(); 
		
		double CelParaFahr =  Double.parseDouble(Aocontrario);
		
		c = ( CelParaFahr * 9/5) + 32;
		
		
		System.out.println("Temperatura em celsius " + c);
		
		entrada.close();
		
		
	}

}
