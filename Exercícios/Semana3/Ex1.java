/* 1. Soma de Dois Números
Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles. */


import java.util.Scanner;

                               //1 - SOMA       
 public class Ex1 {  	
 
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler os números do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o primeiro número
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        // Solicitar ao usuário o segundo número
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        // Realizar a soma
        int soma = numero1 + numero2;

        // Exibir o resultado
        System.out.println("A soma dos dois numeros e: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}
















