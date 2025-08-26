package TiposPrimitivos;

import javax.swing.JOptionPane;

public class DesafioConversão {

	public static void main(String[] args) {
		
		String Salario1 = JOptionPane.showInputDialog("Digite o seu salario");
		String Salario2 = JOptionPane.showInputDialog("Digite o seu salario");
		String Salario3 = JOptionPane.showInputDialog("Digite o seu salario");
		
		double TrasformaSalario1 = Double.parseDouble(Salario1.replace("," ,"."));//receber determinado valor 
		double TrasformaSalario2 = Double.parseDouble(Salario2.replace("," ,"."));
		double TrasformaSalario3 = Double.parseDouble(Salario3.replace("," ,"."));
	
		
		double Media = (TrasformaSalario1 + TrasformaSalario2 + TrasformaSalario3) / 3 ;
		 
	
		JOptionPane.showInputDialog(null ,"Sua media e " + Media);//anular entrada 
		
	}
	
}
