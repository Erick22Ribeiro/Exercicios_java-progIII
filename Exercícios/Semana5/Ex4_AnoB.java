/* 4: Verificação de Ano Bissexto
Descrição: 
Desenvolva um programa que leia um ano e verifique se ele é bissexto ou não, 
 utilizando if-else. 
Critérios para ser bissexto: 
• Deve ser divisível por 4. 
• Se for divisível por 100, deve também ser divisível por 400.  */

import java.util.Scanner;

public class Ex4_AnoB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if(ano % 4 == 0){
             System.out.println("Divisivel por 4, ano bissexto.");
        }
        else if(ano % 100 == 0 && ano % 400 == 0){
            System.out.println("Divisivel por 100 e 400, ano bissexto.");
        }
        else{
            System.out.print("Ano nao bissexto");
        }
        scanner.close();
    }

}