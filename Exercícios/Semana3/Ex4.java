/* 4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas. */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média simples
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe o resultado
        System.out.printf("A media aritmética das notas e: %.2f\n", media);

        // Fecha o scanner
        scanner.close();
    }
}
