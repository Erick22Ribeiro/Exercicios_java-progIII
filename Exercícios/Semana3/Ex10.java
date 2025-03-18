/* 10. Distância Entre Dois Pontos
Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²) */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as coordenadas dos dois pontos
        System.out.print("Digite a coordenada x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite a coordenada y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite a coordenada x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Digite a coordenada y2: ");
        double y2 = scanner.nextDouble();

        // Calcula a distancia entre os pontos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Exibe o resultado
        System.out.printf("A distancia entre os pontos e: %.2f\n", distancia);

        scanner.close();
    }
}
