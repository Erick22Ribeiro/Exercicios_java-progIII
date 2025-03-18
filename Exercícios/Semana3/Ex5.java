/* 5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a idade em anos
        System.out.print("Digite sua idade em anos: ");
        int idadeEmAnos = scanner.nextInt();

        // Calcula a quantidade aproximada de dias (considerando que um ano tem 365 dias)
        int diasVividos = idadeEmAnos * 365;

        // Exibe o resultado
        System.out.println("Voce ja viveu " + diasVividos + " dias.");

        // Fecha o scanner
        scanner.close();
    }
}
