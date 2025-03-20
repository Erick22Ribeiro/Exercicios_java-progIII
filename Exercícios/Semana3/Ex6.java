/* 6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido. */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario bruto: R$ ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o valor do desconto do INSS: R$ ");
        double descontoINSS = scanner.nextDouble();
        
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("O salario liquido e: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}
