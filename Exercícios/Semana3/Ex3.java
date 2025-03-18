/* 3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

Fórmula: F = (C × 9/5) + 32. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Converte a temperatura de Celsius para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Exibe o resultado
        System.out.printf("A temperatura em Fahrenheit e: %.2f\n", fahrenheit);

        // Fecha o scanner
        scanner.close();
    }
}
