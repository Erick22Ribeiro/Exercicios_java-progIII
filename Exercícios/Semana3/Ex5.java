/* 5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite sua idade em anos: ");
        int idadeEmAnos = scanner.nextInt();

        int diasVividos = idadeEmAnos * 365;

        System.out.println("Voce ja viveu " + diasVividos + " dias.");

        scanner.close();
    }
}
