package Operadores;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        double a = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe o valor de B:");
        double b = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe o valor de C:");
        double c = Double.parseDouble(entrada.nextLine());

        double delta = (b * b) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            double raizDelta = Math.sqrt(delta);

            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);

            System.out.println("As raízes são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        entrada.close();
    }
}
