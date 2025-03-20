/* 1: Soma dos N primeiros números naturais 
Descrição: 
Crie um programa que solicite ao usuário um número N e utilize um loop for para calcular a soma dos primeiros N números naturais. 
Requisitos: 
• O programa deve utilizar um contador para iterar de 1 até N. • Deve utilizar um acumulador para somar os valores sucessivos. • Ao final, exibir a soma total.  */


import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int N = 0;

        System.out.print("Digite o valor de N: ");
        N = scanner.nextInt();

        for(int i = 1; i < N; i++){

            soma += i;    

        }

        System.out.printf("Soma de 1 ate N: %d", soma);

        scanner.close();
    }
}

