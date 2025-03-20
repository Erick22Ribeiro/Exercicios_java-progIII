/* 3: Contagem regressiva usando do-while 
Descrição: 
Crie um programa que solicite um número ao usuário e faça uma contagem  regressiva até 0, utilizando um loop do-while. 
Requisitos: 
• O programa deve solicitar um número inteiro positivo ao usuário. 
• Utilizar um contador decrescente para reduzir o valor até 0. 
• Exibir os números da contagem regressiva um por um.  */

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero: ");
        num = scanner.nextInt();

        for(int i = num; i > -1; i--){
            System.out.printf("%d\n", i);
        }

        scanner.close();
    }
}
