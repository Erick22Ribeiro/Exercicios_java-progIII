/* 2. area de um Círculo
Desenvolva um programa que leia o raio de um circulo e calcule sua area.

Formula: area = π * raio²

Considere π = 3.14159. */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        final double PI = 3.14159; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        
        double area = PI * Math.pow(raio, 2);
        
        System.out.printf("A area do circulo e: %.4f\n", area);

        scanner.close();
    }
}


