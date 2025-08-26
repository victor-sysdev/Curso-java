package TiposPrimitivos;



import java.util.Scanner;



public class ConvertendoStringNumero2 {



    public static void main(String[] args) {

        

        Scanner scanner = new Scanner(System.in);



        System.out.println("Qual é seu primeiro salário?");

        String Salario1 = scanner.nextLine().replace(",", ".");



        System.out.println("Qual é seu segundo salário?");

        String Salario2 = scanner.nextLine().replace(",", ".");



        System.out.println("Qual é seu terceiro salário?");

        String Salario3 = scanner.nextLine().replace(",", ".");



        // Conversão para double

        double TransformaSalario1 = Double.parseDouble(Salario1);

        double TransformaSalario2 = Double.parseDouble(Salario2);

        double TransformaSalario3 = Double.parseDouble(Salario3);



        // Cálculo da média

        double media = (TransformaSalario1 + TransformaSalario2 + TransformaSalario3) / 3;



        System.out.println("Sua média é: " + media);



        scanner.close();

    }

}