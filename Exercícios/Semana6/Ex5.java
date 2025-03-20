/* 5: Números primos em um intervalo 
Descrição: 
Escreva um programa que solicite dois números ao usuário e exiba todos os  números primos no intervalo entre eles, 
utilizando um loop aninhado (for dentro de for). 
Requisitos: 
• O programa deve solicitar dois números inteiros positivos (início e fim  do intervalo). 
• Deve utilizar um loop externo para percorrer os números dentro do  intervalo. 
• Deve utilizar um loop interno para verificar se cada número é primo. • Exibir apenas os números primos encontrados. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        boolean numPrimo = true;

        System.out.print("Digite o primero numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        for(int i = num1; i <= num2; i++){

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    numPrimo = false;
                    break;
                }
            }
            
            if(numPrimo && i > 1){
                System.out.printf("%d ", i);
            }
        }

        scanner.close();
    }
}
    