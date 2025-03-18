/* 7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura

Perímetro = 2 × (base + altura). */


import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a base e altura do retangulo
        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();

        // Calcula a area e o perimetro
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        // Exibe o resultado
        System.out.printf("A area do retangulo e: %.2f\n", area);
        System.out.printf("O perimetro do retangulo e: %.2f\n", perimetro);

        scanner.close();
    }
}
