/* 6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido. */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salario bruto e o desconto do INSS
        System.out.print("Digite o salario bruto: R$ ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o valor do desconto do INSS: R$ ");
        double descontoINSS = scanner.nextDouble();

        // Calcula o salario liquido
        double salarioLiquido = salarioBruto - descontoINSS;

        // Exibe o resultado
        System.out.printf("O salario liquido e: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}
