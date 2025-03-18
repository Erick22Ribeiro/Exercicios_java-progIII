/* 2. area de um Círculo
Desenvolva um programa que leia o raio de um circulo e calcule sua area.

Formula: area = π * raio²

Considere π = 3.14159. */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        final double PI = 3.14159; // Definição da constante π
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuario o valor do raio
        System.out.print("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();

        // Calcula a area do circulo
        double area = PI * Math.pow(raio, 2);

        // Exibe o resultado
        System.out.printf("A area do circulo e: %.4f\n", area);

        scanner.close();
    }
}


