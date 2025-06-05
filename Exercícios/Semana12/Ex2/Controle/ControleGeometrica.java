package Ex2.Controle;

import Ex2.Dominio.Circulo;
import Ex2.Dominio.Retangulo;
import Ex2.Dominio.FormaGeometrica;
import java.util.Scanner;

public class ControleGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        
        FormaGeometrica retangulo = new Retangulo(largura, altura);
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        
        FormaGeometrica circulo = new Circulo(raio);
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        scanner.close();
    }
}
