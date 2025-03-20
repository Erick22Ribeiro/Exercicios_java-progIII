/* 3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

Fórmula: F = (C × 9/5) + 32. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("A temperatura em Fahrenheit e: %.2f\n", fahrenheit);

        scanner.close();
    }
}
