/* 9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$). */

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$ ");
        double reais = scanner.nextDouble();

        System.out.print("Digite a cotacao do dolar: R$ ");
        double cotacaoDolar = scanner.nextDouble();

        double dolares = reais / cotacaoDolar;

        System.out.printf("O valor em dolares e: US$ %.2f\n", dolares);

        scanner.close();
    }
}
