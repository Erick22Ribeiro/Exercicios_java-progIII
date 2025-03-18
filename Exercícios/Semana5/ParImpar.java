/* 1: Verificação de Número Par ou Ímpar 
Descrição: 
Crie um programa que solicite um número inteiro ao usuário e determine se ele é  par ou ímpar, utilizando a estrutura if-else. 
Requisitos: 
• O programa deve ler um número inteiro. 
• Se o número for divisível por 2, exibir "O número é par." 
• Caso contrário, exibir "O número é ímpar.".  */


/* import java.util.Scanner;

public class VerificacaoParImpar {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
 */
/* 
 anotações: 

 println --> adiciona quebra de linha 
*/
 import java.util.Scanner;

 public class ParImpar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero e par.");
        }
        else{
            System.out.println("O numero e impar.");
        }

        scanner.close();
    }
 }