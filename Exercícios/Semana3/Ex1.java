/* 1. Soma de Dois Números
Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles. */


import java.util.Scanner;    
 public class Ex1 {  	
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois numeros e: " + soma);
        scanner.close();
    }
}
















