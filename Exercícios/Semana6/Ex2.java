/* 2: Tabuada de um número 
Descrição: 
Escreva um programa que solicite um número ao usuário e exiba a tabuada  desse número de 1 a 10, utilizando um loop while. 
Requisitos: 
• O programa deve pedir um número inteiro ao usuário. 
• Utilizar um contador para iterar de 1 a 10. 
• Exibir a multiplicação do número pelo contador em cada iteração.  */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero para calcular a tabuada: ");
        num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }

        scanner.close();
    }
}
